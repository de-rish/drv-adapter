plugins {
    alias(libs.plugins.git.version) apply false
}

subprojects {
    repositories {
        mavenCentral()
    }

    apply(plugin = "java-library")
    apply(plugin = "maven-publish")
    apply(plugin = "com.palantir.git-version")

    group = "de.luebeckregatta"
    val gitVersion: groovy.lang.Closure<String> by extra
    version = gitVersion(mapOf("prefix" to "versions/")) // versions/1.0.0 -> 1.0.0

    configure<JavaPluginExtension> {
        sourceCompatibility = JavaVersion.VERSION_11
        withSourcesJar()
    }

    configure<PublishingExtension> {
        publications {
            create<MavenPublication>("library") {
                from(components["java"])
            }
        }
        repositories {
            maven {
                name = "github"
                url = uri("https://maven.pkg.github.com/de-rish/drv-adapter")
                credentials {
                    username = System.getenv("GITHUB_ACTOR")
                    password = System.getenv("GITHUB_TOKEN")
                }
            }
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
        reports {
            junitXml.required.set(true)
        }
    }
}

tasks.wrapper {
    gradleVersion = "8.8"
}
