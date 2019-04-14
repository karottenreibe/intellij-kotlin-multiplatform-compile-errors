package sample

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual class Sample {
    actual fun checkMe() = 7
}

actual object Platform {
    actual val name: String = "iOS"
}

actual val dispatcher: CoroutineDispatcher
    get() = Dispatchers.Main