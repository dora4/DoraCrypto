package com.doracrypto.crypto

import dora.util.IoUtils

object AppConfig {

    const val PREFS_RSA_PRIVATE = "rsa_private"
    const val PREFS_RSA_PUBLIC = "rsa_public"
    const val PREFS_SETTINGS_SOUND_SETTING = "sound_setting"
    const val PREFS_SETTINGS_OFFLINE_MODE = "offline_mode"
    const val RSA_PRIVATE_KEY = "RSA PRIVATE KEY"
    const val RSA_PUBLIC_KEY = "RSA PUBLIC KEY"
    const val MENU_NAME_ENCRYPT_BY_AES = "encryptByAES"
    const val MENU_NAME_DECRYPT_BY_AES = "decryptByAES"
    const val MENU_NAME_RESET_KEY_PAIR = "resetKeyPair"
    const val MENU_NAME_ENCRYPT_BY_RSA = "encryptByRSA"
    const val MENU_NAME_DECRYPT_BY_RSA = "decryptByRSA"
    const val MENU_NAME_ENCRYPT = "encrypt"
    const val MENU_NAME_DECRYPT = "decrypt"
    const val MENU_NAME_SAVE = "save"
    const val MENU_NAME_INJECT = "inject"
    const val MENU_NAME_REGENERATE = "regenerate"
    const val MENU_NAME_ORIGINAL_CONTENT = "originalContent"
    const val MENU_NAME_ENCRYPTED_CONTENT = "encryptedContent"
    const val MENU_NAME_SECRET_KEY = "secretKey"
    const val MENU_NAME_PRIVATE_KEY = "privateKey"
    const val MENU_NAME_PUBLIC_KEY = "publicKey"
    const val MENU_NAME_FEEDBACK = "feedback"
    const val MENU_NAME_SHARE = "share"
    const val MENU_NAME_SETTINGS = "settings"
    const val KEY_RESULT = "result"
    const val KEY_IS_VERIFIED = "is_verified"

    const val EVENT_TYPE_RESET_KEY_PAIR = MENU_NAME_RESET_KEY_PAIR
    const val REQUEST_CODE_INJECT = 0x01
    const val REQUEST_CODE_CONNECT_WALLET = 0x0a
    const val FEEDBACK_SERVER_URL = "http://dorachat.com:9696/api/"
    const val CONFIG_SERVER_URL = "http://dorachat.com:9696/api/"
    const val URI_DOWNLOAD_APP: String = "https://www.pgyer.com/cryptotools"
    const val PRODUCT_NAME: String = "cryptotools"
    const val ROUTE_HOME = "home"
    const val DB_NAME = "db_crypto"
    const val DB_VERSION = 3
    const val DORAFUND_ACCESS_KEY = "8KdSz7ejXqe9"
    const val DORAFUND_SECRET_KEY = "BGDuzl4nYvb7U75VsmuNVsQ3yXcA7GIm"
    const val MERCHANT_ERC20_ADDRESS = "0xcBa852Ef29a43a7542B88F60C999eD9cB66f6000"
    const val IS_VIP = "isVip"
    const val DEFAULT_PLATFORM_LIMIT_NUM = 2
    const val DEFAULT_AUTHORIZATION_LIMIT_NUM = 10
    const val DEFAULT_ACCOUNT_LIMIT_NUM = 10
    const val VIP_PLATFORM_LIMIT_NUM = 10
    const val VIP_AUTHORIZATION_LIMIT_NUM = 100
    const val VIP_ACCOUNT_LIMIT_NUM = 100

    /**
     * 扩展的授权平台数量。
     */
    const val ADDED_PLATFORM_NUM = "addedPlatformNum"

    /**
     * 扩展的授权账号数量。
     */
    const val ADDED_AUTHORIZATION_NUM = "addedAuthorizationNum"

    /**
     * 扩展的直登账号数量。
     */
    const val ADDED_ACCOUNT_NUM = "addedAccountNum"

    const val GOODS_TYPE_BUY_VIP = 0
    const val GOODS_TYPE_BUY_PLATFORM_NUM = 1
    const val GOODS_TYPE_BUY_AUTHORIZATION_NUM = 2
    const val GOODS_TYPE_BUY_ACCOUNT_NUM = 3

    var FOLDER_APP = IoUtils.getSdRoot() + "/CryptoTools/"
    var FOLDER_OUTPUT = FOLDER_APP+"out/"
    var FOLDER_EXPORT = FOLDER_APP+"export/"
    var JSON_HOT_PLATFORM = "hot_platform.json"
    var JSON_HOT_AUTHORIZATION = "hot_authorization.json"
    var JSON_HOT_ACCOUNT = "hot_account.json"

    const val ACTION_OFFLINE_MODE_CHANGED = "com.doracrypto.crypto.ACTION_OFFLINE_MODE_CHANGED"
    const val ACTION_VIP_BADGE_CHANGED = "com.doracrypto.crypto.ACTION_VIP_BADGE_CHANGED"
    const val ACTION_EDIT_HOT_PLATFORM = "com.doracrypto.crypto.ACTION_EDIT_HOT_PLATFORM"
    const val ACTION_EDIT_HOT_AUTHORIZATION = "com.doracrypto.crypto.ACTION_EDIT_HOT_AUTHORIZATION"
    const val ACTION_EDIT_HOT_ACCOUNT = "com.doracrypto.crypto.ACTION_EDIT_HOT_ACCOUNT"
}