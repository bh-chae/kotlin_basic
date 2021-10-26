package chapter04.section2

fun main() {
    val result = callbyName(otherLambda) //람다식 이름으로 호출
    println(result)
}

fun callbyName(b: () -> Boolean) : Boolean{ // 람다식 함수 자료형으로 선언된 매개변수
    println("Call by Nam Function") // 람다식의 내용물이 모두 인자로 들어감
    return b()
}

val otherLambda: () -> Boolean = {
    println("OtherLambda Function")
    true // 마지막이 return 값
}