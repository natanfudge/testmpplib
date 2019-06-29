package sample

actual class Sample {
    actual fun checkMe() = 42
}

actual object Platform {
    actual val name: String = "JVM"
}

fun veryUsefulJvmFunc() = println("Yes I'm using this from... android I guess.")