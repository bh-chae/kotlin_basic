package chapter06.section2

import kotlinx.coroutines.*


fun main() = runBlocking<Unit>{ //메인 메서드가 코루틴 환경에서 실행
    launch{ // 백그라운드로 코루틴 실행
        delay(1000L)
        println("World!!!!!!")

    }
    println("Hellow") //즉시 이어서 실행
    //delay(2000L) //delay() 를 사용하지 않아도 코루틴을 기다림
}