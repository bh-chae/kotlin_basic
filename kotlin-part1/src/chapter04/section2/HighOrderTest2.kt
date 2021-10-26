package chapter04.section2

fun main() {
    val result1 : Int

    result1 = highOrder({x, y -> x+y}, 10, 20) // 함수 인자({람다식}, a, b)
    println(result1)
}

fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int { //함수이름(매개변수(함수:람다식), a, b)
    return(sum(a,b))
}