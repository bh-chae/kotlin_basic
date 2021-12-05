package chapter06.section2

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun doWork1(): String{
    delay (1000)
    return "Work1"
}

suspend fun doWork2(): String{
    delay(3000)
    return "wortk2"
}

private fun workInSerial(): Job{
    //순차 실행
    val job = GlobalScope.launch {
        val one = doWork1()
        val two = doWork2()
        println("Kotlin One : $one")
        println("Kotlin Two : $two")
    }
    return job
}

private fun workInParallel(): Job{
    val one = GlobalScope.async{
        doWork1()
    }
    val two = GlobalScope.async{
        doWork2()
    }
    val job = GlobalScope.launch{
        val combined = one.await() + "_" + two.await()
        println("Kotlin COmbined : $combined")
    }
    return job
}

fun main() = runBlocking {
    val time = measureTimeMillis {
//        val job = workInSerial()
//        //readLine()
//        job.join()
        val job = workInParallel()
        job.join()
    }
    println("time : $time")
}