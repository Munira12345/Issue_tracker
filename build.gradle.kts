// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("com.apollographql.apollo3") version "3.7.2" apply false
}
 task<Delete>("clean") {
        delete(rootProject.buildDir)
    }
