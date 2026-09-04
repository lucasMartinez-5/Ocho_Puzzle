plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "bo.edu.uajms.lucasmartinez.aOchoPuzzle"
    compileSdk {
<<<<<<< HEAD
        version = release(37) {
=======
        version = release(36) {
>>>>>>> 11a1e5e876a5a999e80483ad2f37f9b12463e7eb
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "bo.edu.uajms.lucasmartinez.aOchoPuzzle"
        minSdk = 24
<<<<<<< HEAD
        targetSdk = 37
=======
        targetSdk = 36
>>>>>>> 11a1e5e876a5a999e80483ad2f37f9b12463e7eb
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}