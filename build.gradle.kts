group = "dev.yekta"
version = "1.0.0"

plugins {
    kotlin("jvm") version "1.4.32"
    `maven-publish`
}

java {
    withJavadocJar()
    withSourcesJar()
}

repositories {
    jcenter()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
}

sourceSets {
    main { java.srcDirs("src/main") }
    test { java.srcDirs("src/test") }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks {
    withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class).all {
        kotlinOptions {
            jvmTarget = "1.8"
            allWarningsAsErrors = true
            useIR = true
        }
    }

    test {
        useJUnitPlatform()
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifactId = "anynum"

            pom {
                name.set("AnyNum")
                description.set("Kotlin extensions to convert/generate English, Persian, and Arabic digits with ease.")
                url.set("https://github.com/YektaDev/AnyNum")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("YektaDev")
                        name.set("Ali Khaleqi Yekta")
                        email.set("Me@Yekta.Dev")
                    }
                }
                scm {
                    connection.set("scm:git:https://github.com/YektaDev/AnyNum.git")
                    url.set("https://github.com/YektaDev/AnyNum")
                }
            }
        }
    }
}
