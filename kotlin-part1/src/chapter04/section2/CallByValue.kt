package chapter04.section2

fun main() {
    val result = callByValue(lambda()) //람다식 호출
    println(result)
}

fun callByValue(b: Boolean) : Boolean { //일반 변수 자료형으로 선언된 매개변수
    println("Call by Value Function") // 결과 값이 인자로 들어감
    return b
}

val lambda: () -> Boolean = { //람다 표현식이 두줄 (인자가 없이 단순 출력)
     println("Lambda Function")
    true // 마지막 표현식 문장의 결과가 반환
}