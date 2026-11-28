plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "dev.droidtop.hackerkeyboard"
    compileSdk { version = release(37) { minorApiLevel = 1 } }

    defaultConfig {
        // Its own identity: never Hacker's Keyboard's (org.pocketworkstation.pckeyboard), which people may still have
        // installed, nor droidtop's, which embeds the same keyboard.
        applicationId = "dev.droidtop.hackerkeyboard"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "0.1.0"
        ndk {
            abiFilters += "arm64-v8a"
            abiFilters += "x86_64"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation(project(":keyboard"))
}
