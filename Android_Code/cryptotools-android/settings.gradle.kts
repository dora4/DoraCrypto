pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "com.android.tools.build") {
                useModule("com.android.tools.build:gradle:8.1.1")
            }
            if (requested.id.namespace == "org.jetbrains.kotlin") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:2.2.21")
            }
            if (requested.id.namespace == "com.google.firebase") {
                useModule("com.google.firebase:firebase-crashlytics-gradle:2.9.2")
            }
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven {
            setUrl("https://jitpack.io")
        }
    }
}

rootProject.name = "dora-crypto-tools"
include(":app")

