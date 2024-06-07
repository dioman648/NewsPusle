plugins {
    id("java-library")
    id(libs.plugins.kotlinJvm.get().pluginId) apply false
    alias(libs.plugins.kotlinSerialization) apply false
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    implementation(libs.retrofit)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.serialization.json)
}