plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.trigonometrypro.app"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.trigonometrypro.app"
        minSdk = 23
        targetSdk = 35
        versionCode = 1323
        versionName = "13.2.3"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}
