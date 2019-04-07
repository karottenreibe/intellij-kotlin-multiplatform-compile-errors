package sample

import kotlinx.coroutines.CoroutineDispatcher

expect class Sample() {
    fun checkMe(): Int
}

expect object Platform {
    val name: String
}

expect val dispatcher: CoroutineDispatcher

fun hello(): String = "Hello from ${Platform.name}"

class Proxy {
    fun proxyHello() = hello()
}

fun main() {
    println(hello())
}