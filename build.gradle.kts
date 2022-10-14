// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") apply false
    id("com.android.library") apply false
    id("org.jetbrains.kotlin.android") apply false
    id("com.google.dagger.hilt.android") version("2.43.2") apply false
}

buildscript {
    dependencies {
        classpath(AndroidX.navigation.safeArgsGradlePlugin)
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.43.2")
    }
}