plugins {
    val kotlinVersion = "1.6.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.10.0"
}

group = "org.fenglin"
version = "1.0"

repositories {
    maven("https://maven.aliyun.com/repository/central")
    mavenCentral()
}
