plugins {
    id("application")
}

group = "com.craftinginterpreters.lox"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.register<JavaExec>("runLox") {
    group = "application"
    description = "Runs the Lox interpreter"

    mainClass.set("com.craftinginterpreters.lox.Lox")
    //classpath = sourceSets["main"].runtimeClasspath
    classpath = sourceSets["main"].runtimeClasspath

    doFirst {
        println("Starting lox interpreter")
    }

    doLast {
        println("Lox interpreter finished")
    }
}