package com.doracrypto.crypto.ui.activity

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.core.content.ContextCompat
import com.doracrypto.crypto.AppConfig

import dora.BaseActivity

import com.doracrypto.crypto.R
import com.doracrypto.crypto.databinding.ActivityAesEncryptionBinding
import dora.firebase.SpmUtils.spmSelectContent
import dora.util.CryptoUtils
import dora.util.DensityUtils
import dora.util.IntentUtils
import dora.util.StatusBarUtils
import dora.util.ViewUtils
import dora.widget.Tips
import dora.widget.panel.MenuPanel
import dora.widget.panel.MenuPanelItem
import dora.widget.panel.MenuPanelItemGroup
import dora.widget.panel.MenuPanelItemRoot
import dora.widget.panel.menu.ButtonMenuPanelItem
import dora.widget.panel.menu.InputMenuPanelItem

class AesEncryptionActivity : BaseActivity<ActivityAesEncryptionBinding>() {

    private var aesKey: String? = null
    private var content: String? = null

    override fun getLayoutId(): Int {
        return R.layout.activity_aes_encryption
    }

    override fun onSetStatusBar() {
        super.onSetStatusBar()
        StatusBarUtils.setStatusBar(this, ContextCompat.getColor(this, R.color.colorPrimary))
    }

    override fun initData(savedInstanceState: Bundle?, binding: ActivityAesEncryptionBinding) {
        binding.menuPanel.addMenuGroup(
            MenuPanelItemGroup("AES Secret Key",
                MenuPanelItemRoot.Span(DensityUtils.DP6),
                InputMenuPanelItem(
                    menuName = AppConfig.MENU_NAME_SECRET_KEY,
                    hint = getString(R.string.enter_16_letters_or_numbers),
                    content = "",
                    watcher = object : InputMenuPanelItem.ContentWatcher {
                        override fun onContentChanged(item: InputMenuPanelItem, content: String) {
                            this@AesEncryptionActivity.aesKey = content
                        }
                    })
            )
        ).addMenuGroup(
            MenuPanelItemGroup(
                getString(R.string.content_to_be_encrypted),
                MenuPanelItemRoot.Span(DensityUtils.dp2px(6f), DensityUtils.dp2px(6f)),
                InputMenuPanelItem(
                    menuName = AppConfig.MENU_NAME_ORIGINAL_CONTENT,
                    hint = getString(R.string.enter_content_to_be_encrypted),
                    content = "",
                    watcher = object : InputMenuPanelItem.ContentWatcher {
                        override fun onContentChanged(item: InputMenuPanelItem, content: String) {
                            this@AesEncryptionActivity.content = content
                        }
                    }),
            )
        ).addMenu(
            ButtonMenuPanelItem(
                marginTop = DensityUtils.DP10,
                menuName = AppConfig.MENU_NAME_ENCRYPT,
                text = getString(R.string.encrypt),
                textColor = ContextCompat.getColor(this, R.color.colorPrimary)
            )
        )
        binding.menuPanel.setOnPanelMenuClickListener(object : MenuPanel.OnPanelMenuClickListener {

            override fun onMenuClick(position: Int, view: View, menuName: String,
                                     item: MenuPanelItem) {
                when (menuName) {
                    AppConfig.MENU_NAME_ENCRYPT -> {
                        spmSelectContent("点击AES加密按钮")
                        if (aesKey?.length != 16) {
                            Tips.showWarning(getString(R.string.length_must_be_no_less_than_16))
                            return
                        }
                        if (content == null || content?.length == 0) {
                            Tips.showWarning(getString(R.string.enter_content_to_be_encrypted))
                            return
                        }
                        val result = CryptoUtils.encryptAES(aesKey, content)
                        if (result !== "") {
                            IntentUtils.startActivityWithString(this@AesEncryptionActivity,
                                ResultActivity::class.java, AppConfig.KEY_RESULT, result)
                        } else {
                            Tips.showWarning(R.string.encryption_failed)
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