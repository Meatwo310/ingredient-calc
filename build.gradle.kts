plugins {
    application
}

dependencies {

}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
        vendor = JvmVendorSpec.AMAZON
    }
}

application {
    mainClass = "Main"
}