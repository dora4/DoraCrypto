package com.doracrypto.crypto.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.doracrypto.crypto.AppConfig
import com.doracrypto.crypto.AppConfig.RSA_PRIVATE_KEY
import com.doracrypto.crypto.AppConfig.RSA_PUBLIC_KEY
import com.doracrypto.crypto.helper.CryptoHelper

import dora.BaseActivity

import com.doracrypto.crypto.R
import com.doracrypto.crypto.databinding.ActivityResetKeyPairBinding
import com.doracrypto.crypto.model.Card
import com.doracrypto.crypto.ui.adapter.CardAdapter
import dora.firebase.SpmUtils.spmSelectContent
import dora.util.DensityUtils
import dora.util.IntentUtils
import dora.util.SPUtils
import dora.util.ServiceUtils
import dora.util.StatusBarUtils
import dora.util.ViewUtils
import dora.widget.DoraDoubleButtonDialog
import dora.widget.Tips
import dora.widget.panel.MenuPanel
import dora.widget.panel.MenuPanelItem
import dora.widget.panel.MenuPanelItemGroup
import dora.widget.panel.menu.ButtonMenuPanelItem

class ResetKeyPairActivity : BaseActivity<ActivityResetKeyPairBinding>() {

    private val adapter = CardAdapter()

    override fun getLayoutId(): Int {
        return R.layout.activity_reset_key_pair
    }

    override fun onSetStatusBar() {
        super.onSetStatusBar()
        StatusBarUtils.setStatusBar(this, ContextCompat.getColor(this, R.color.colorPrimary))
    }

    private fun refreshCard() {
        val cards = arrayListOf(
            Card(RSA_PRIVATE_KEY, SPUtils.readString(this@ResetKeyPairActivity, AppConfig.PREFS_RSA_PRIVATE)),
            Card(RSA_PUBLIC_KEY, SPUtils.readString(this@ResetKeyPairActivity, AppConfig.PREFS_RSA_PUBLIC))
        )
        adapter.setList(cards)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        window.addFlags(WindowManager.LayoutParams.FLAG_SECURE)
        super.onCreate(savedInstanceState)
    }

    override fun initData(savedInstanceState: Bundle?, binding: ActivityResetKeyPairBinding) {
        ViewUtils.configRecyclerView(binding.recyclerView, LinearLayoutManager(this))
            .adapter = adapter
        adapter.setOnItemLongClickListener { adapter, _, position ->
            val card = adapter.getItem(position) as Card
            when (card.title) {
                RSA_PRIVATE_KEY -> {
                    spmSelectContent("复制RSA私钥")
                }
                RSA_PUBLIC_KEY -> {
                    spmSelectContent("复制RSA公钥")
                }
            }
            ServiceUtils.copyText(this@ResetKeyPairActivity, card.title, card.content)
            Tips.showSuccess(getString(R.string.copied_successfully))
            true
        }
        refreshCard()
        binding.menuPanel.addMenuGroup(
            MenuPanelItemGroup(
                DensityUtils.DP10,
                ButtonMenuPanelItem(AppConfig.MENU_NAME_INJECT,
                    getString(R.string.inject), ContextCompat.getColor(this, R.color.colorPrimary)),
                ButtonMenuPanelItem(AppConfig.MENU_NAME_REGENERATE,
                    getString(R.string.regenerate), ContextCompat.getColor(this, R.color.colorPrimary))
            )
        )
        binding.menuPanel.setOnPanelMenuClickListener(object : MenuPanel.OnPanelMenuClickListener {

            override fun onMenuClick(position: Int, view: View, menuName: String,
                                     item: MenuPanelItem
            ) {
                when (menuName) {
                    AppConfig.MENU_NAME_INJECT -> {
                        spmSelectContent("点击注入RSA密钥按钮")
                        IntentUtils.startActivityForResult(this@ResetKeyPairActivity,
                            InjectKeyPairActivity::class.java, AppConfig.REQUEST_CODE_INJECT)
                    }
                    AppConfig.MENU_NAME_REGENERATE -> {
                        spmSelectContent("点击重置RSA密钥按钮")
                        val dialog = DoraDoubleButtonDialog(this@ResetKeyPairActivity, object : DoraDoubleButtonDialog.DialogListener {

                            override fun onCancel(eventType: String) {
                                if (eventType == AppConfig.EVENT_TYPE_RESET_KEY_PAIR) {
                                    spmSelectContent("取消重置RSA密钥")
                                }
                            }

                            override fun onConfirm(eventType: String) {
                                if (eventType == AppConfig.EVENT_TYPE_RESET_KEY_PAIR) {
                                    spmSelectContent("确定重置RSA密钥")
                                    CryptoHelper.generateKeyPair(this@ResetKeyPairActivity)
                                    refreshCard()
                                }
                            }
                        })
                        dialog.show(AppConfig.EVENT_TYPE_RESET_KEY_PAIR,
                            getString(R.string.are_you_sure_you_want_to_reset),
                            getString(R.string.kind_tips))
                    }
                }
            }
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == AppConfig.REQUEST_CODE_INJECT) {
                refreshCard()
            }
        }
    }
}