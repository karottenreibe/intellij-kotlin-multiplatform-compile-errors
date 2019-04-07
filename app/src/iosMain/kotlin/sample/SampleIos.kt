package sample

import kotlinx.coroutines.CoroutineDispatcher

actual class Sample {
    actual fun checkMe() = 7
}

actual object Platform {
    actual val name: String = "iOS"
}

actual val dispatcher: CoroutineDispatcher
    get() = TODO("not implemented")