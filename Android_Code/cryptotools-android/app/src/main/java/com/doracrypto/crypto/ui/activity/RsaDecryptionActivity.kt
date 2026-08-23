package com.doracrypto.crypto.ui.activity

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.doracrypto.crypto.AppConfig

import dora.BaseActivity

import com.doracrypto.crypto.R
import com.doracrypto.crypto.databinding.ActivityRsaDecryptionBinding
import com.doracrypto.crypto.helper.SoundHelper
import dora.firebase.SpmUtils.spmSelectContent
import dora.util.CryptoUtils
import dora.util.DensityUtils
import dora.util.IntentUtils
import dora.util.SPUtils
import dora.util.StatusBarUtils
import dora.util.TextUtils
import dora.widget.Tips
import dora.widget.panel.MenuPanel
import dora.widget.panel.MenuPanelItem
import dora.widget.panel.MenuPanelItemGroup
import dora.widget.panel.MenuPanelItemRoot
import dora.widget.panel.menu.ButtonMenuPanelItem
import dora.widget.panel.menu.InputMenuPanelItem

class RsaDecryptionActivity : BaseActivity<ActivityRsaDecryptionBinding>() {

    private var content: String? = null

    override fun getLayoutId(): Int {
        return R.layout.activity_rsa_decryption
    }

    override fun onSetStatusBar() {
        super.onSetStatusBar()
        StatusBarUtils.setStatusBar(this, ContextCompat.getColor(this, R.color.colorPrimary))
    }

    override fun initData(savedInstanceState: Bundle?, binding: ActivityRsaDecryptionBinding) {
        binding.menuPanel.addMenuGroup(
            MenuPanelItemGroup(
                getString(R.string.encrypted_content),
                MenuPanelItemRoot.Span(DensityUtils.DP6),
                InputMenuPanelItem(
                    menuName = AppConfig.MENU_NAME_ENCRYPTED_CONTENT,
                    hint = getString(R.string.enter_encrypted_content),
                    content = "",
                    watcher = object : InputMenuPanelItem.ContentWatcher {
                    override fun onContentChanged(item: InputMenuPanelItem, content: String) {
                        this@RsaDecryptionActivity.content = content
                    }
                })
            )
        ).addMenu(ButtonMenuPanelItem(
            marginTop = DensityUtils.DP10,
            menuName = AppConfig.MENU_NAME_DECRYPT,
            text = getString(R.string.decrypt),
            textColor = ContextCompat.getColor(this, R.color.colorPrimary)))
        binding.menuPanel.setOnPanelMenuClickListener(object : MenuPanel.OnPanelMenuClickListener {

            override fun onMenuClick(position: Int, view: View, menuName: String,
                                     item: MenuPanelItem
            ) {
                when (menuName) {
                    AppConfig.MENU_NAME_DECRYPT -> {
                        spmSelectContent("点击RSA解密按钮")
                        if (content == null || content?.length == 0) {
                            Tips.showWarning(getString(R.string.enter_encrypted_content))
                            return
                        }
                        val result = CryptoUtils.decryptByPrivate(SPUtils.readString(this@RsaDecryptionActivity, AppConfig.PREFS_RSA_PRIVATE), content)
                        if (!TextUtils.isEmpty(result)) {
                            SoundHelper.playResSound(this@RsaDecryptionActivity, R.raw.op_success)
                            IntentUtils.startActivityWithString(this@RsaDecryptionActivity,
                                ResultActivity::class.java, AppConfig.KEY_RESULT, result)
                        } else {
                            SoundHelper.playResSound(this@RsaDecryptionActivity, R.raw.op_failure)
                            Tips.showWarning(R.string.decryption_failed)
                        }
                    }
                }
            }
        })
    }
}