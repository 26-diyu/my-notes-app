// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.3" apply false
}
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // ... other classpath dependencies
        classpath("io.realm:realm-gradle-plugin:10.15.1") // Use the latest version
    }
}