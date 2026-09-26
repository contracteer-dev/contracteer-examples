plugins {
    java
}

group = "com.musketeer"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    // OpenAPI document
    implementation("com.musketeer:musketeer-spec:1.0.0")

    // JSON serialization
    implementation("com.fasterxml.jackson.core:jackson-databind:2.18.3")

    testImplementation("dev.contracteer:contracteer-mockserver:4.1.1")
    testImplementation("org.assertj:assertj-core:3.27.3")
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.4")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testRuntimeOnly("org.slf4j:slf4j-simple:2.0.16")
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
        showStandardStreams = true
    }
}
