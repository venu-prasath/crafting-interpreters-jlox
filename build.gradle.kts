plugins {
    application
}

val appJavaVersion = JavaVersion.VERSION_11
val appMainClass = "com.craftinginterpreters.lox.Lox"
val appName = "jlox"
val appJarVersion = "1.0-SNAPSHOT"

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

java {
    sourceCompatibility = appJavaVersion
    targetCompatibility = appJavaVersion
}

application {
    mainClass.set(appMainClass)
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
    standardOutput = System.out
}

tasks.named<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "com.craftinginterpreters.lox.Lox"
    }
}