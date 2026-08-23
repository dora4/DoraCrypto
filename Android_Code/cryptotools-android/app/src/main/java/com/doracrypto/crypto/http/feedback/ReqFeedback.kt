package com.doracrypto.crypto.http.feedback

import com.doracrypto.crypto.helper.DeviceInfoProvider
import com.doracrypto.crypto.http.BaseReq
import com.google.gson.Gson

data class ReqFeedback(val productName: String,
                       var feedbackType: Int = 0,
                       var feedbackContent: String,
                       var feedbackExtras: String = "") : BaseReq() {


    init {
        feedbackExtras = Gson().toJson(DeviceInfoProvider.collect())
        payload = sort()
    }
}