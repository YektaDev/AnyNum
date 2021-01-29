import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val compileKotlin: KotlinCompile by tasks
val compileTestKotlin: KotlinCompile by tasks

plugins {
    java
    kotlin("jvm") version "1.4.30-RC"
    application
}

repositories {
    jcenter()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
}

sourceSets {
    main {
        java {
            setSrcDirs(listOf("src/main"))
        }
    }

    test {
        java {
            setSrcDirs(listOf("src/test"))
        }
    }
}

dependencies {
    constraints {
        implementation("org.apache.commons:commons-text:1.9")
    }

    implementation(kotlin("stdlib-jdk8"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.test {
    useJUnitPlatform()
}

compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}