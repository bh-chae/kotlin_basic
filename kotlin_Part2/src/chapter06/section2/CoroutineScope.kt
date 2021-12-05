package chapter06.section2

import kotlinx.coroutines.*

fun main() = runBlocking(Dispatchers.Default){
    launch(Dispatchers.IO) {
        delay(1200L)
        println("Task From Runblocking")
    }

    coroutineScope {
        launch{
            delay(1500L)
            println("Task From Nested Launch")
        }
        delay(200L)
        println("TaskFrom CoroutineScope")
    }

    println("End of RUnblock")
}