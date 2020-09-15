import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "nexos.intellij.reqif"

buildscript {
  repositories {
    mavenCentral()
    jcenter()
  }
  dependencies { classpath(kotlin("gradle-plugin", "1.4.10")) }
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
  testImplementation("org.junit.jupiter", "junit-jupiter-api", "5.6.2")
  testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", "5.6.2")
  runtimeOnly("org.jetbrains.kotlin","kotlin-reflect", "1.4.10")
  implementation(kotlin("stdlib-jdk8"))
}

plugins {
  java
  kotlin("jvm") version "1.4.10"
  id("org.jetbrains.intellij") version "0.4.22"
}

tasks.withType<JavaCompile> {
  sourceCompatibility = "1.8"
  targetCompatibility = "1.8"
}

// compile bytecode to java 8 (default is java 6)
tasks.withType<KotlinCompile> {
  kotlinOptions {
    jvmTarget = "1.8"
  //  freeCompilerArgs = listOf("-XXLanguage:+InlineClasses")
  }
}

intellij {
  version = "2020.2.1"
  downloadSources = true
}

sourceSets.findByName("main")?.java {
  srcDir("src/gen/java")
}