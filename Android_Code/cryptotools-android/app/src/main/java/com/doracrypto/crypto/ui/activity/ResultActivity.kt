package com.doracrypto.crypto.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.doracrypto.crypto.AppConfig

import com.doracrypto.crypto.R
import com.doracrypto.crypto.databinding.ActivityResultBinding
import dora.firebase.SpmUtils.spmSelectContent
import dora.util.IntentUtils
import dora.util.ServiceUtils
import dora.util.StatusBarUtils
import dora.widget.Tips
import dora.BaseActivity

class ResultActivity : BaseActivity<ActivityResultBinding>() {

    private lateinit var result: String

    override fun getLayoutId(): Int {
        return R.layout.activity_result
    }

    override fun onSetStatusBar() {
        super.onSetStatusBar()
        StatusBarUtils.setStatusBar(this, ContextCompat.getColor(this, R.color.colorPrimary))
    }

    override fun onGetExtras(action: String?, bundle: Bundle?, intent: Intent) {
        super.onGetExtras(action, bundle, intent)
        result = IntentUtils.getStringExtra(intent, AppConfig.KEY_RESULT)
    }

    override fun initData(savedInstanceState: Bundle?, binding: ActivityResultBinding) {
        binding.tvResult.text = result
        binding.tvResult.setOnLongClickListener {
            spmSelectContent("复制结果页面内容")
            ServiceUtils.copyText(this@ResultActivity, AppConfig.KEY_RESULT, result)
            Tips.showSuccess(getString(R.string.copied_successfully))
            true
        }
        binding.ivClose.setOnClickListener {
            finish()
        }
    }
}