package chapter06.section2

import kotlin.random.Random
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime


//takeIf()함수는 람다식이 true이면 결과를 반환하고, takeUnless()함수는 람다식이 false이면 결과를 반환합니다

// 표준 함수의 정의
public inline fun <T> T.takeIf(predicate: (T) -> Boolean): T?
        = if (predicate(this)) this else null

@OptIn(ExperimentalTime::class)
fun main() {
    //엘비스 연산자
    val input = "Kotlin"
    val keyword = "in"

    //입력 문자열에 키워드가 있으면 인덱스를 반환하는 함수를 takeif로 구현
    input.indexOf(keyword).takeIf { it > 0 } ?: error("keyword Not Found")

    //takeUnless를 사용해 구현
    input.indexOf(keyword).takeUnless { it <0 }?: error("KEYWORD NOT FOUND")

    //시간측정
    val executionTime = measureTime {
        var k = 0
        for(i in 1..1000){
            k += i
        }
        println(k)
    }
    println(executionTime)

    //난수생성
    val number = Random.nextInt(32)
    println("Kotline Rand : $number")
}
