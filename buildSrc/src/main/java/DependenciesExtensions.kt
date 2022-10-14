import org.gradle.kotlin.dsl.DependencyHandlerScope


//fun DependencyHandlerScope.implementation(dependencyNotation: Any) {
//    add("implementation", dependencyNotation)
//}
//
//fun DependencyHandlerScope.kapt(dependencyNotation: Any) {
//    add("kapt", dependencyNotation)
//}
fun DependencyHandlerScope.addImpl(dependencyNotation: Any){
    add("implementation", dependencyNotation)
}

fun DependencyHandlerScope.addKapt(dependencyNotation: Any){
    add("kapt", dependencyNotation)
}

fun DependencyHandlerScope.useNavigation() {
    addImpl(AndroidX.navigation.commonKtx)
    addImpl(AndroidX.navigation.fragmentKtx)
    addImpl(AndroidX.navigation.uiKtx)
    addImpl(AndroidX.navigation.runtimeKtx)
}

fun DependencyHandlerScope.useHilt() {
    addImpl(Google.dagger.hilt.android)
    addKapt(Google.dagger.hilt.compiler)
    addImpl(AndroidX.hilt.navigationFragment)
    addImpl(AndroidX.hilt.work)
    addKapt(AndroidX.hilt.compiler)
}

fun DependencyHandlerScope.useRoom() {
    addImpl(AndroidX.room.runtime)
    addKapt(AndroidX.room.compiler)
    addImpl(AndroidX.room.ktx)
}

//fun DependencyHandlerScope.useExoplayer() {
//    implementation(Exoplayer.player)
//    implementation(Exoplayer.core)
//    implementation(Exoplayer.dash)
//    implementation(Exoplayer.smoothStreaming)
//    implementation(Exoplayer.hls)
//    implementation(Exoplayer.ui)
//    implementation(Exoplayer.rtsp)
//    implementation(Exoplayer.leanback)
//    implementation(Exoplayer.mediaSession)
//}
