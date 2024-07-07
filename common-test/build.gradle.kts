import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("java-test-fixtures")
    alias(libs.plugins.kotlin)
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<PublishToMavenRepository>().configureEach { enabled = false }
