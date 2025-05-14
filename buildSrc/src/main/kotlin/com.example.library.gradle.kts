import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

tasks {
  withType<KotlinCompile> {
    compilerOptions {
      languageVersion = KotlinVersion.KOTLIN_2_0
    }
  }
}
