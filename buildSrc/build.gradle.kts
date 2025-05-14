plugins {
  `java-gradle-plugin` // Needed to created plugin libraries
  `kotlin-dsl`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.1.21")
}
