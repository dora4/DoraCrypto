package com.doracrypto.crypto.ui.activity

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.core.content.ContextCompat
import com.doracrypto.crypto.AppConfig
import com.doracrypto.crypto.R
import com.doracrypto.crypto.databinding.ActivityAesDecryptionBinding
import com.doracrypto.crypto.helper.SoundHelper
import dora.BaseActivity
import dora.firebase.SpmUtils.spmSelectContent
import dora.util.CryptoUtils
import dora.util.DensityUtils
import dora.util.IntentUtils
import dora.util.StatusBarUtils
import dora.util.TextUtils
import dora.util.ViewUtils
import dora.widget.Tips
import dora.widget.panel.MenuPanel
import dora.widget.panel.MenuPanelItem
import dora.widget.panel.MenuPanelItemGroup
import dora.widget.panel.MenuPanelItemRoot
import dora.widget.panel.menu.ButtonMenuPanelItem
import dora.widget.panel.menu.InputMenuPanelItem

class AesDecryptionActivity : BaseActivity<ActivityAesDecryptionBinding>() {

    private var aesKey: String? = null
    private var content: String? = null

    override fun getLayoutId(): Int {
        return R.layout.activity_aes_decryption
    }

    override fun onSetStatusBar() {
        super.onSetStatusBar()
        StatusBarUtils.setStatusBar(this, ContextCompat.getColor(this, R.color.colorPrimary))
    }

    override fun initData(savedInstanceState: Bundle?, binding: ActivityAesDecryptionBinding) {
        binding.menuPanel.addMenuGroup(
            MenuPanelItemGroup("AES Secret Key",
                MenuPanelItemRoot.Span(DensityUtils.DP6),
                InputMenuPanelItem(
                    menuName = AppConfig.MENU_NAME_SECRET_KEY,
                    hint = getString(R.string.enter_16_letters_or_numbers),
                    content = "",
                    watcher = object : InputMenuPanelItem.ContentWatcher {
                        override fun onContentChanged(item: InputMenuPanelItem, content: String) {
                            this@AesDecryptionActivity.aesKey = content
                        }
                    })
            )
        ).addMenuGroup(
            MenuPanelItemGroup(
                getString(R.string.encrypted_content),
                MenuPanelItemRoot.Span(DensityUtils.DP6),
                InputMenuPanelItem(
                    menuName = AppConfig.MENU_NAME_ENCRYPTED_CONTENT,
                    hint = getString(R.string.enter_encrypted_content),
                    content = "",
                    watcher = object : InputMenuPanelItem.ContentWatcher {
                        override fun onContentChanged(item: InputMenuPanelItem, content: String) {
                            this@AesDecryptionActivity.content = content
                        }
                    })
            )
        ).addMenu(ButtonMenuPanelItem(
            marginTop = DensityUtils.DP10,
            menuName = AppConfig.MENU_NAME_DECRYPT,
            text = getString(R.string.decrypt),
            textColor = ContextCompat.getColor(this, R.color.colorPrimary)))
        binding.menuPanel.setOnPanelMenuClickListener(object : MenuPanel.OnPanelMenuClickListener {

            override fun onMenuClick(position: Int, view: View, menuName: String, item: MenuPanelItem) {
                when (menuName) {
                    AppConfig.MENU_NAME_DECRYPT -> {
                        spmSelectContent("点击AES解密按钮")
                        if (aesKey?.length != 16) {
                            Tips.showWarning(getString(R.string.length_must_be_no_less_than_16))
                            return
                        }
                        if (content == null || content?.length == 0) {
                            Tips.showWarning(getString(R.string.enter_encrypted_content))
                            return
                        }
                        val result = CryptoUtils.decryptAES(aesKey, content)
                        if (!TextUtils.isEmpty(result)) {
                            SoundHelper.playResSound(this@AesDecryptionActivity, R.raw.op_success)
                            IntentUtils.startActivityWithString(this@AesDecryptionActivity,
                                ResultActivity::class.java, AppConfig.KEY_RESULT, result)
                        } else {
                            SoundHelper.playResSound(this@AesDecryptionActivity, R.raw.op_failure)
                            Tips.showWarning(R.string.decryption_failed)
                        }
                    }
                }
            }
        })
        val etInput = binding.menuPanel.getViewByPosition(0, InputMenuPanelItem.ID_EDIT_TEXT_INPUT) as EditText
        ViewUtils.setMaxLength(etInput, 16)
        ViewUtils.setDigits(etInput, "0123456789abcdefghigklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ")
    }
}