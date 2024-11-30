plugins {
    id("java")
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

tasks.register<JavaExec>("buildLox") {
    group = "application"
    description = "build the Lox interpreter"

    mainClass.set("com.craftinginterpreters.lox.Lox")
    classpath = sourceSets["main"].runtimeClasspath

    doFirst {
        println("Starting lox interpreter")
    }

    doLast {
        println("Lox interpreter finished")
    }
}

tasks.jar {
    archiveBaseName.set("jlox")
    archiveVersion.set("1.0-SNAPSHOT")

    manifest {
        attributes["Main-Class"] = "com.craftinginterpreters.lox.Lox"
    }
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it)})
}

tasks.classes {
    finalizedBy(tasks.jar)
}

tasks.register<JavaExec>("launchJar") {
    dependsOn("buildLox")
    group = "application"
    description = "Runs the Lox interpreter"

    mainClass.set("com.craftinginterpreters.lox.Lox")
    classpath = files("${layout.buildDirectory}/libs/jlox-1.0-SNAPSHOT.jar")

}