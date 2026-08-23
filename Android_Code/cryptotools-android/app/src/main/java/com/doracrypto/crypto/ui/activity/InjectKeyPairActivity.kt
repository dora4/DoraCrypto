package com.doracrypto.crypto.ui.activity

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.doracrypto.crypto.AppConfig

import dora.BaseActivity

import com.doracrypto.crypto.R
import com.doracrypto.crypto.databinding.ActivityInjectKeyPairBinding
import dora.firebase.SpmUtils.spmSelectContent
import dora.util.DensityUtils
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

class InjectKeyPairActivity : BaseActivity<ActivityInjectKeyPairBinding>() {

    private var privateKey: String? = null
    private var publicKey: String? = null

    override fun getLayoutId(): Int {
        return R.layout.activity_inject_key_pair
    }

    override fun onSetStatusBar() {
        super.onSetStatusBar()
        StatusBarUtils.setStatusBar(this, ContextCompat.getColor(this, R.color.colorPrimary))
    }

    override fun initData(savedInstanceState: Bundle?, binding: ActivityInjectKeyPairBinding) {
        binding.menuPanel.addMenuGroup(
            MenuPanelItemGroup(getString(R.string.rsa_private_key),
                MenuPanelItemRoot.Span(DensityUtils.DP6),
                InputMenuPanelItem(
                    menuName = AppConfig.MENU_NAME_PRIVATE_KEY,
                    hint = getString(R.string.enter_rsa_private_key),
                    content = "",
                    watcher = object : InputMenuPanelItem.ContentWatcher {
                        override fun onContentChanged(item: InputMenuPanelItem, content: String) {
                            this@InjectKeyPairActivity.privateKey = content
                        }
                    })
            )
        ).addMenuGroup(
            MenuPanelItemGroup(getString(R.string.rsa_public_key),
                MenuPanelItemRoot.Span(DensityUtils.DP6),
                InputMenuPanelItem(
                    menuName = AppConfig.MENU_NAME_PUBLIC_KEY,
                    hint = getString(R.string.enter_rsa_public_key),
                    content = "",
                    watcher = object : InputMenuPanelItem.ContentWatcher {
                        override fun onContentChanged(item: InputMenuPanelItem, content: String) {
                            this@InjectKeyPairActivity.publicKey = content
                        }
                    })
            )
        ).addMenu(
            ButtonMenuPanelItem(
                marginTop = DensityUtils.DP10,
                menuName = AppConfig.MENU_NAME_SAVE,
                text = getString(R.string.save),
                textColor = ContextCompat.getColor(this, R.color.colorPrimary)
            )
        )
        binding.menuPanel.setOnPanelMenuClickListener(object : MenuPanel.OnPanelMenuClickListener {
            override fun onMenuClick(position: Int, view: View, menuName: String,
                                     item: MenuPanelItem) {
                when (menuName) {
                    AppConfig.MENU_NAME_SAVE -> {
                        spmSelectContent("确定注入RSA密钥")
                        if (TextUtils.checkAllNotEmpty(privateKey, publicKey)) {
                            SPUtils.writeString(
                                this@InjectKeyPairActivity,
                                AppConfig.PREFS_RSA_PRIVATE,
                                privateKey
                            )
                            SPUtils.writeString(
                                this@InjectKeyPairActivity,
                                AppConfig.PREFS_RSA_PUBLIC,
                                publicKey
                            )
                            setResult(Activity.RESULT_OK)
                            finish()
                        } else {
                            Tips.showWarning(R.string.injection_failed)
                        }
                    }
                }
            }
        })
    }
}