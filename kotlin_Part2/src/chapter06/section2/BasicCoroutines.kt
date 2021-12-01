package chapter06.section2

import kotlinx.coroutines.*

fun main() { //메인 스레드로 역할
    runBlocking{
        val job = GlobalScope.launch {//새로운 코루틴을 백그라운드에 실행
            delay(1000L) //1초의 넌블로킹 지연(시간의 기본단위는 ms)
            //일시 중단된 사이에 다른 루틴을 블록킹 하지 않음 --> 다른 일을 할수 있게 함
            println("World!") //지연 후 출력
            doSomething()
        }
        println("Hellow") //main 스레드가 코루틴이 지연되는 동안 계속 실행
        println("job : ${job.isActive}, ${job.isCompleted}")
//    Thread.sleep(2000L) //main 스레드가 JVM에서 바로 종료되지 않게 2초 기다림
        job.join()
        println("job : ${job.isActive}, ${job.isCompleted}")
    }
}

suspend fun doSomething(){ //코루틴 블럭 안에서 수행 가능
    println("Do Something")
}