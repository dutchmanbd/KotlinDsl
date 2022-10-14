plugins {
    `kotlin-dsl`
}


repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}
dependencies {
    implementation("de.fayard.refreshVersions:refreshVersions:0.50.2")
    implementation("com.android.tools.build:gradle:7.3.0")
    implementation(kotlin("gradle-plugin", "1.7.20"))
    implementation(gradleApi())
    implementation(localGroovy())
}