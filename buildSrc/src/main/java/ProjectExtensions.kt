import org.gradle.api.Project
import org.gradle.kotlin.dsl.*
import com.android.build.gradle.BaseExtension
import org.gradle.api.plugins.ExtensionAware
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
import com.android.build.gradle.internal.tasks.factory.dependsOn

fun Project.setupCommonDependencies() {
    dependencies {
        val implementation by configurations
        val testImplementation by configurations
        val androidTestImplementation by configurations

        testImplementation(AndroidX.test.ext.junit.ktx)
        testImplementation(Testing.junit4)
        androidTestImplementation(AndroidX.test.ext.junit.ktx)
        androidTestImplementation(AndroidX.test.runner)
        androidTestImplementation(AndroidX.test.espresso.core)
        androidTestImplementation(AndroidX.test.rules)

        implementation(
            fileTree(
                "dir" to "libs",
                "include" to listOf("*.jar")
            )
        )

//        implementation(Kotlin.stdlib.jdk8)
    }
}
