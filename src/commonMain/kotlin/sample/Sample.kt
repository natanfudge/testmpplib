package sample

expect class Sample() {
    fun checkMe(): Int
}

expect object Platform {
    val name: String
}

fun hello(): String = "Hello from ${Platform.name}"

fun veryUsefulMultiplatformFunc() = println("Yes I'm using this from every platform on earth")