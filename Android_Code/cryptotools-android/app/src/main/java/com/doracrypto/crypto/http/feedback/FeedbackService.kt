package com.doracrypto.crypto.http.feedback

import com.doracrypto.crypto.http.ApiResult
import dora.http.retrofit.ApiService
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface FeedbackService : ApiService {

    /**
     * 提交反馈建议。
     */
    @POST("feedback/add")
    fun commitFeedback(@Body body: RequestBody): Call<ApiResult<Boolean>>
}