package com.doracrypto.crypto.helper

import android.content.Context
import com.doracrypto.crypto.AppConfig
import dora.util.CryptoUtils
import dora.util.SPUtils

object CryptoHelper {

    /**
     * 生成RSA的私钥和公钥。
     */
    fun generateKeyPair(context: Context, isLoad: Boolean = false) {
        val map = CryptoUtils.generateRSAKeyPair(2048)
        val privateKey = map[CryptoUtils.PRIVATE_KEY]
        val publicKey = map[CryptoUtils.PUBLIC_KEY]
        if (isLoad && (SPUtils.hasKey(context, AppConfig.PREFS_RSA_PRIVATE)
                    || SPUtils.hasKey(context, AppConfig.PREFS_RSA_PUBLIC))) {
            return
        }
        SPUtils.writeString(context, AppConfig.PREFS_RSA_PRIVATE, privateKey)
        SPUtils.writeString(context, AppConfig.PREFS_RSA_PUBLIC, publicKey)
    }
}