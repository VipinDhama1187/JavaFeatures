plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

val junitVersion: String by project

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter", "junit-jupiter-api", junitVersion)
    testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", junitVersion)
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}