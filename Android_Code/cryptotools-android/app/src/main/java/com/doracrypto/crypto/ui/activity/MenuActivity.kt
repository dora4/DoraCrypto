package com.doracrypto.crypto.ui.activity

import android.content.ActivityNotFoundException
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.doracrypto.crypto.AppConfig
import com.doracrypto.crypto.AppConfig.PREFS_SETTINGS_OFFLINE_MODE
import com.doracrypto.crypto.R
import com.doracrypto.crypto.databinding.ActivityMenuBinding
import com.facebook.share.model.ShareLinkContent
import com.facebook.share.widget.ShareDialog
import dora.BaseActivity
import dora.firebase.SpmUtils.spmSelectContent
import dora.security.RootChecker
import dora.util.ApkUtils
import dora.util.DensityUtils
import dora.util.IntentUtils
import dora.util.ProcessUtils
import dora.util.SPUtils
import dora.util.StatusBarUtils
import dora.widget.DoraAlertDialog
import dora.widget.DoraBottomDialog
import dora.widget.DoraTitleBar
import dora.widget.panel.MenuPanel
import dora.widget.panel.MenuPanelItem
import dora.widget.panel.MenuPanelItemGroup
import dora.widget.panel.MenuPanelItemRoot
import dora.widget.panel.menu.IconMenuPanelItem

class MenuActivity : BaseActivity<ActivityMenuBinding>() {

    override fun getLayoutId(): Int {
        return R.layout.activity_menu
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        splashScreen.setKeepOnScreenCondition {
            if (RootChecker(this).isRooted) {
                showShortToast(getString(R.string.root_not_supported))
                ProcessUtils.killAllProcesses()
                SystemClock.sleep(3000)
                false
            } else {
                false
            }
        }
        LocalBroadcastManager.getInstance(this)
            .registerReceiver(offlineModeReceiver, IntentFilter(AppConfig.ACTION_OFFLINE_MODE_CHANGED))
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK) {
            if (requestCode == AppConfig.REQUEST_CODE_CONNECT_WALLET) {
            }
        }
    }

    override fun onSetStatusBar() {
        super.onSetStatusBar()
        StatusBarUtils.setStatusBar(this, ContextCompat.getColor(this, R.color.colorPrimary))
    }

    override fun onDestroy() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(offlineModeReceiver)
        super.onDestroy()
    }

    private val offlineModeReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            if (intent?.action == AppConfig.ACTION_OFFLINE_MODE_CHANGED) {
                updateMenuPanel()
            }
            if (intent?.action == AppConfig.ACTION_OFFLINE_MODE_CHANGED) {
                updateMenuPanel()
            }
        }
    }

    private fun updateMenuPanel() {
        mBinding.menuPanel.clearAll()
        mBinding.menuPanel.addMenuGroup(
            MenuPanelItemGroup(
                "AES",
                MenuPanelItemRoot.Span(DensityUtils.DP6),
                IconMenuPanelItem(
                    AppConfig.MENU_NAME_ENCRYPT_BY_AES,
                    R.drawable.ic_lock,
                    getString(R.string.aes_encryption)
                ),
                IconMenuPanelItem(
                    AppConfig.MENU_NAME_DECRYPT_BY_AES,
                    R.drawable.ic_unlock,
                    getString(R.string.aes_decryption)
                )
            )
        ).addMenuGroup(
            MenuPanelItemGroup(
                "RSA",
                MenuPanelItemRoot.Span(DensityUtils.DP6),
                IconMenuPanelItem(
                    AppConfig.MENU_NAME_RESET_KEY_PAIR,
                    R.drawable.ic_key,
                    getString(R.string.reset_key_pair)
                ),
                IconMenuPanelItem(
                    AppConfig.MENU_NAME_ENCRYPT_BY_RSA,
                    R.drawable.ic_lock,
                    getString(R.string.rsa_encryption)
                ),
                IconMenuPanelItem(
                    AppConfig.MENU_NAME_DECRYPT_BY_RSA,
                    R.drawable.ic_unlock,
                    getString(R.string.rsa_decryption)
                ),
            )
        )
        mBinding.menuPanel.addMenuGroup(
            MenuPanelItemGroup(
                "Settings",
                MenuPanelItemRoot.Span(DensityUtils.DP6),
                IconMenuPanelItem(
                    AppConfig.MENU_NAME_SETTINGS,
                    R.drawable.ic_settings,
                    getString(R.string.settings)
                ),
            )
        )
        if (!SPUtils.readBoolean(this, PREFS_SETTINGS_OFFLINE_MODE)) {
            val aboutItems = arrayOf(
                IconMenuPanelItem(
                    AppConfig.MENU_NAME_FEEDBACK,
                    R.drawable.ic_feedback,
                    getString(R.string.feedback)
                ),
                IconMenuPanelItem(
                    AppConfig.MENU_NAME_SHARE,
                    R.drawable.ic_share,
                    getString(R.string.share_with_friends)
                )
            )
            mBinding.menuPanel.addMenuGroup(
                MenuPanelItemGroup(
                    "About",
                    MenuPanelItemRoot.Span(DensityUtils.DP6), items = aboutItems,
                )
            )
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun initData(savedInstanceState: Bundle?, binding: ActivityMenuBinding) {
        binding.titleBar.setOnIconClickListener(object : DoraTitleBar.OnIconClickListener {

            override fun onIconBackClick(icon: AppCompatImageView) {
                spmSelectContent("查看应用卡片")
                DoraAlertDialog.create(this@MenuActivity)
                    .show(R.layout.dialog_version_card) {
                        hideBottomButtons()
                        getView<TextView>(R.id.tvCardName)?.apply {
                            text =
                                "${getString(R.string.app_name)} v${ApkUtils.getVersionName(this@MenuActivity)}"
                        }
                        getView<TextView>(R.id.tvBrand)?.apply {
                            setOnLongClickListener {
                                spmSelectContent("打开官网链接")
                                true
                            }
                            setOnClickListener {
                                spmSelectContent("打开官网链接")
                            }
                        }
                    }
            }

            override fun onIconMenuClick(position: Int, icon: AppCompatImageView) {
            }
        })
        updateMenuPanel()
        binding.menuPanel.setOnPanelMenuClickListener(object : MenuPanel.OnPanelMenuClickListener {

            override fun onMenuClick(
                position: Int, view: View, menuName: String,
                item: MenuPanelItem
            ) {
                when (menuName) {
                    AppConfig.MENU_NAME_ENCRYPT_BY_AES -> {
                        IntentUtils.startActivity(AesEncryptionActivity::class.java)
                    }

                    AppConfig.MENU_NAME_DECRYPT_BY_AES -> {
                        IntentUtils.startActivity(AesDecryptionActivity::class.java)
                    }

                    AppConfig.MENU_NAME_RESET_KEY_PAIR -> {
                        IntentUtils.startActivity(ResetKeyPairActivity::class.java)
                    }

                    AppConfig.MENU_NAME_ENCRYPT_BY_RSA -> {
                        IntentUtils.startActivity(RsaEncryptionActivity::class.java)
                    }

                    AppConfig.MENU_NAME_DECRYPT_BY_RSA -> {
                        IntentUtils.startActivity(RsaDecryptionActivity::class.java)
                    }

                    AppConfig.MENU_NAME_FEEDBACK -> {
                        IntentUtils.startActivity(FeedbackActivity::class.java)
                    }
                    AppConfig.MENU_NAME_SHARE -> {
                        DoraBottomDialog().show(this@MenuActivity, R.layout.dialog_share) {
                            val llShareFacebook = it.findViewById<LinearLayout>(R.id.ll_share_facebook)
                            val llShareMore = it.findViewById<LinearLayout>(R.id.ll_share_more)
                            llShareFacebook.setOnClickListener {
                                val content: ShareLinkContent = ShareLinkContent.Builder()
                                    .setContentUrl(Uri.parse(AppConfig.URI_DOWNLOAD_APP))
                                    .build()
                                ShareDialog.show(this@MenuActivity, content)
                            }
                            llShareMore.setOnClickListener {
                                IntentUtils.shareText(this@MenuActivity, getString(R.string.share_with_friends),
                                    getString(R.string.share_content))
                            }
                        }
                    }
                    AppConfig.MENU_NAME_SETTINGS -> {
                        startActivity(Intent(this@MenuActivity, SettingsActivity::class.java))
                    }
                }
            }
        })
    }
}