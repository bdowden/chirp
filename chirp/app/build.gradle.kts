plugins {
    id("chirp.spring-boot-app")
}

group = "com.almiga"
version = "0.0.1-SNAPSHOT"
description = "Kotlin backend in Spring Boot"


dependencies {
    implementation(projects.chat)
    implementation(projects.user)
    implementation(projects.notification)
    implementation(projects.user)
}
