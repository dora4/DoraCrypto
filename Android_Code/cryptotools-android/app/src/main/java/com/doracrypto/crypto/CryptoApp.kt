package com.doracrypto.crypto

import com.doracrypto.crypto.AppConfig.FEEDBACK_SERVER_URL
import com.doracrypto.crypto.http.feedback.FeedbackService
import com.doracrypto.crypto.helper.CryptoHelper
import com.facebook.FacebookSdk
import com.facebook.appevents.AppEventsLogger
import dora.BaseApplication
import dora.http.retrofit.RetrofitManager
import java.util.concurrent.TimeUnit

class CryptoApp : BaseApplication() {

    override fun onCreate() {
        super.onCreate()
        CryptoHelper.generateKeyPair(this, true)
        RetrofitManager.initConfig {
            okhttp {
                connectTimeout(3, TimeUnit.SECONDS)
                readTimeout(10, TimeUnit.SECONDS)
                build()
            }
            mappingBaseUrl(FeedbackService::class.java, FEEDBACK_SERVER_URL)
        }

        // 分享到Facebook
        FacebookSdk.sdkInitialize(this)
        AppEventsLogger.activateApp(this)
    }
}