plugins { application }
repositories { mavenCentral() }
dependencies {
    implementation("network.lightsail:stellar-sdk:6.0.0")
    implementation("com.soneso.stellar:stellar-sdk-jvm:1.16.0")
    implementation("com.google.code.gson:gson:2.15.0")
}
application { mainClass.set("Smoke") }
java { toolchain { languageVersion.set(JavaLanguageVersion.of(21)) } }

dependencyLocking { lockAllConfigurations() }
