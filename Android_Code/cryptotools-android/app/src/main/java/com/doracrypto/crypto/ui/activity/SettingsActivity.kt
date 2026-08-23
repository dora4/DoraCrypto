package com.doracrypto.crypto.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.doracrypto.crypto.AppConfig
import com.doracrypto.crypto.AppConfig.PREFS_SETTINGS_OFFLINE_MODE
import com.doracrypto.crypto.AppConfig.PREFS_SETTINGS_SOUND_SETTING
import com.doracrypto.crypto.BuildConfig

import dora.BaseActivity

import com.doracrypto.crypto.R
import com.doracrypto.crypto.databinding.ActivitySettingsBinding
import dora.firebase.SpmUtils.spmSelectContent
import dora.util.SPUtils
import dora.util.StatusBarUtils
import dora.widget.DoraToggleButton
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class SettingsActivity : BaseActivity<ActivitySettingsBinding>() {

    override fun getLayoutId(): Int {
        return R.layout.activity_settings
    }

    override fun onSetStatusBar() {
        super.onSetStatusBar()
        StatusBarUtils.setStatusBar(this, ContextCompat.getColor(this, R.color.colorPrimary))
    }

    override fun initData(savedInstanceState: Bundle?, binding: ActivitySettingsBinding) {
        binding.tbSettingsSoundSetting.setOnCheckedChangeListener(object : DoraToggleButton.OnCheckedChangeListener {
            override fun onCheckedChanged(view: DoraToggleButton?, isChecked: Boolean) {
                if (isChecked) {
                    spmSelectContent("打开声音")
                } else {
                    spmSelectContent("关闭声音")
                }
                binding.tbSettingsSoundSetting.isChecked = isChecked
                SPUtils.writeBoolean(this@SettingsActivity, PREFS_SETTINGS_SOUND_SETTING, isChecked)
            }
        })
        binding.tbSettingsOfflineMode.setOnCheckedChangeListener(object : DoraToggleButton.OnCheckedChangeListener {
            override fun onCheckedChanged(view: DoraToggleButton?, isChecked: Boolean) {
                if (isChecked) {
                    spmSelectContent("打开离线模式")
                } else {
                    spmSelectContent("关闭离线模式")
                }
                binding.tbSettingsOfflineMode.isChecked = isChecked
                SPUtils.writeBoolean(this@SettingsActivity, PREFS_SETTINGS_OFFLINE_MODE, isChecked)
                val intent = Intent(AppConfig.ACTION_OFFLINE_MODE_CHANGED)
                LocalBroadcastManager.getInstance(this@SettingsActivity).sendBroadcast(intent)
            }
        })
        binding.rlSettingsSoundSetting.setOnClickListener {
            val isChecked = binding.tbSettingsSoundSetting.isChecked
            if (isChecked) {
                spmSelectContent("关闭声音")
            } else {
                spmSelectContent("打开声音")
            }
            binding.tbSettingsSoundSetting.isChecked = !isChecked
            SPUtils.writeBoolean(this, PREFS_SETTINGS_SOUND_SETTING, !isChecked)
        }
        binding.rlSettingsOfflineMode.setOnClickListener {
            val isChecked = mBinding.tbSettingsOfflineMode.isChecked
            if (isChecked) {
                spmSelectContent("关闭离线模式")
            } else {
                spmSelectContent("打开离线模式")
            }
            binding.tbSettingsOfflineMode.isChecked = !isChecked
            SPUtils.writeBoolean(this, PREFS_SETTINGS_OFFLINE_MODE, !isChecked)
            val intent = Intent(AppConfig.ACTION_OFFLINE_MODE_CHANGED)
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent)
        }
        binding.tbSettingsSoundSetting.isChecked = SPUtils.readBoolean(this, PREFS_SETTINGS_SOUND_SETTING)
        binding.tbSettingsOfflineMode.isChecked = SPUtils.readBoolean(this, PREFS_SETTINGS_OFFLINE_MODE)
        val expireAt = BuildConfig.CERT_NOT_AFTER
        val date = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
            .format(Date(expireAt))
        binding.tvAppValidityDate.text = getString(R.string.expired_at, date)
    }
}