plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    id("kotlin-kapt")
    id("kotlin-parcelize")

    id("androidx.navigation.safeargs.kotlin")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.ticonsys.kotlindsl"
    configCommon()

    defaultConfig {
        applicationId = "com.ticonsys.kotlindsl"
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
    }

}

setupCommonDependencies()

dependencies {

    useNavigation()
    useHilt()
    useRoom()

    implementation(project(mapOf("path" to ":utilities")))

    implementation(AndroidX.core.ktx)
    implementation(AndroidX.appCompat)
    implementation(Google.android.material)
    implementation(AndroidX.constraintLayout)
}