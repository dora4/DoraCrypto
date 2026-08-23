package com.doracrypto.crypto.ui.activity

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.doracrypto.crypto.AppConfig

import dora.BaseActivity

import com.doracrypto.crypto.R
import com.doracrypto.crypto.databinding.ActivityRsaEncryptionBinding
import dora.firebase.SpmUtils.spmSelectContent
import dora.util.CryptoUtils
import dora.util.DensityUtils
import dora.util.IntentUtils
import dora.util.SPUtils
import dora.util.StatusBarUtils
import dora.widget.Tips
import dora.widget.panel.MenuPanel
import dora.widget.panel.MenuPanelItem
import dora.widget.panel.MenuPanelItemGroup
import dora.widget.panel.MenuPanelItemRoot
import dora.widget.panel.menu.ButtonMenuPanelItem
import dora.widget.panel.menu.InputMenuPanelItem

class RsaEncryptionActivity : BaseActivity<ActivityRsaEncryptionBinding>() {

    private var content: String? = null

    override fun getLayoutId(): Int {
        return R.layout.activity_rsa_encryption
    }

    override fun onSetStatusBar() {
        super.onSetStatusBar()
        StatusBarUtils.setStatusBar(this, ContextCompat.getColor(this, R.color.colorPrimary))
    }

    override fun initData(savedInstanceState: Bundle?, binding: ActivityRsaEncryptionBinding) {
        binding.menuPanel.addMenuGroup(
            MenuPanelItemGroup(
                getString(R.string.content_to_be_encrypted),
                MenuPanelItemRoot.Span(DensityUtils.DP6),
                InputMenuPanelItem(
                    menuName = AppConfig.MENU_NAME_ORIGINAL_CONTENT,
                    hint = getString(R.string.enter_content_to_be_encrypted),
                    content = "",
                    watcher = object : InputMenuPanelItem.ContentWatcher {
                    override fun onContentChanged(item: InputMenuPanelItem, content: String) {
                        this@RsaEncryptionActivity.content = content
                    }
                }),
            )
        ).addMenu(ButtonMenuPanelItem(
            marginTop = DensityUtils.DP10,
            menuName = AppConfig.MENU_NAME_ENCRYPT,
            text = getString(R.string.encrypt),
            textColor = ContextCompat.getColor(this, R.color.colorPrimary)))
        binding.menuPanel.setOnPanelMenuClickListener(object : MenuPanel.OnPanelMenuClickListener {

            override fun onMenuClick(position: Int, view: View, menuName: String,
                                     item: MenuPanelItem
            ) {
                when (menuName) {
                    AppConfig.MENU_NAME_ENCRYPT -> {
                        spmSelectContent("点击RSA加密按钮")
                        if (content == null || content?.length == 0) {
                            Tips.showWarning(getString(R.string.enter_content_to_be_encrypted))
                            return
                        }
                        val result = CryptoUtils.encryptByPublic(SPUtils.readString(this@RsaEncryptionActivity, AppConfig.PREFS_RSA_PUBLIC), content)
                        if (result !== "") {
                            IntentUtils.startActivityWithString(this@RsaEncryptionActivity,
                                ResultActivity::class.java, AppConfig.KEY_RESULT, result)
                        } else {
                            Tips.showWarning(R.string.encryption_failed)
                        }
                    }
                }
            }
        })
    }
}