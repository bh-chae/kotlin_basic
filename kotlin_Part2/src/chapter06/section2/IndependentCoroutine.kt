package chapter06.section2

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("RunBlocking : $coroutineContext")
    val request = launch{
        println("Request: $coroutineContext")
        GlobalScope.launch { //프로그램 전역으로 독립적인 수행 (부모-자식 관계 없음)
            println("job1 : Before Suspend function, $coroutineContext")
            delay(1000)
            println("job1 : After Suspend Function, $coroutineContext")
        }
        //launch{ //부모의 문맥을 상속 (상위 launch의 자식)
        //launch(Dispatchers.Default){ //부모의 문맥을 상속(상위 launch의 자식), 분리된 작업)
        CoroutineScope(Dispatchers.Default).launch{ //새로운 스코프가 구성되 Request와 무관)
            delay(100)
            println("job2 : before suspend Function. $coroutineContext")
            delay( 1000)
            println("job2 : after suspend function, ${coroutineContext }}")//request(부모)가 취소되면 수행되지 않음

        }
    }
    delay(500)
    request.cancel() //부모 코루틴의 취소
    delay(1000)


}
