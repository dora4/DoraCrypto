import java.io.FileInputStream
import java.security.KeyStore
import java.security.cert.X509Certificate

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
//    id("com.google.firebase.firebase-perf")
}

android {
    namespace = "com.doracrypto.crypto"
    compileSdk = 36
    buildToolsVersion = "36.1.0"

    // 注意：证书过期不代表不能安装
    fun getCertValidity(
        jksPath: String,
        storePassword: String,
        alias: String
    ): Pair<Long, Long> {
        val ks = KeyStore.getInstance("JKS")
        FileInputStream(jksPath).use {
            ks.load(it, storePassword.toCharArray())
        }
        val cert = ks.getCertificate(alias) as X509Certificate
        return cert.notBefore.time to cert.notAfter.time
    }

    signingConfigs {
        getByName("debug") {
            storeFile = File(rootDir, "crypto-tools.jks")
            keyAlias = "key0"
            keyPassword = "123456"
            storePassword = "123456"
            enableV1Signing = true
            enableV2Signing = true
        }
        create("release") {
            storeFile = File(rootDir, "crypto-tools.jks")
            keyAlias = "key0"
            keyPassword = "123456"
            storePassword = "123456"
            enableV1Signing = true
            enableV2Signing = true
        }
    }
    defaultConfig {
        applicationId = "com.doracrypto.crypto"
        minSdk = 24
        versionCode = 1
        versionName = "1.0.0-community"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
        val jksPath = "${rootDir}/crypto-tools.jks"
        val alias = "key0"
        val (notBefore, notAfter) =
            getCertValidity(jksPath, "123456", alias)
        buildConfigField(
            "long",
            "CERT_NOT_BEFORE",
            notBefore.toString()
        )
        buildConfigField(
            "long",
            "CERT_NOT_AFTER",
            notAfter.toString()
        )
    }

    buildTypes {
        debug {
            isDebuggable = true
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        release {
            isDebuggable = false
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        this.dataBinding = true
        this.buildConfig = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

kotlin {
    // 安装了多jdk的情况下，编译时自动帮你选jvm，否则需要手动操作IDE
    jvmToolchain(17)
}

fun libFileTree() : ConfigurableFileTree {
    val map = hashMapOf<String, Any>()
    map["include"] = arrayOf("*.jar", "*.aar")
    map["dir"] = "libs"
    return fileTree(map)
}

dependencies {
    implementation(libFileTree())
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
    implementation("androidx.core:core-splashscreen:1.2.0-alpha01")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
    implementation("com.github.dora4:dora:1.3.68")
    implementation("com.github.dora4:dora-brvah-support:1.6")
    implementation("com.github.dora4:dora-firebase-support:1.14")
    implementation("com.github.dora4:dora-glide-support:1.7")
    implementation("com.github.dora4:dcache-android:3.6.16")
    implementation("com.github.dora4:dview-titlebar:1.40")
    implementation("com.github.dora4:dview-menu-panel:1.47")
    implementation("com.github.dora4:dview-toast:1.1")
    implementation("com.github.dora4:dview-alert-dialog:1.42")
    implementation("com.github.dora4:dview-loading-dialog:1.7")
    implementation("com.github.dora4:dview-bottom-dialog:1.13")
    implementation("com.github.dora4:dview-swipe-layout:1.1")
    implementation("com.github.dora4:dview-empty-layout:1.14")
    implementation("com.github.dora4:dview-swipe-menu:1.1")
    implementation("com.github.dora4:dview-flow-layout:1.3")
    implementation("com.github.dora4:dview-table-view:1.13")
    implementation("com.github.dora4:dview-expandable-layout:1.2")
    implementation("com.github.dora4:dview-text-view:1.0")
    implementation("com.github.dora4:dview-toggle-button:1.5")
    implementation("com.github.dora4:dview-radio-group:1.0")

    implementation("com.facebook.android:facebook-android-sdk:17.0.2")
}