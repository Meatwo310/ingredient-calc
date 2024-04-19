plugins {
    application
}

dependencies {

}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "Main"
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
}