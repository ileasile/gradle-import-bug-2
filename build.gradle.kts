//import included.g

plugins {
    kotlin("jvm") version "1.4.10"
}

group = "org.example"
//version = "1.${g()}-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))
    implementation(kotlin("stdlib"))
}
