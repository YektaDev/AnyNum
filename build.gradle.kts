group = "dev.yekta"
version = "1.0.0"

plugins {
    application
    kotlin("jvm") version "1.4.32"
    java
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
