package chapter05.section1

import java.lang.Integer.parseInt

fun main() {

    var x = 10
    when (x) {
        0, 1 -> println("x == 0 or x==1")
        else -> println("기타")

    }

    var f: Int = 10
    when (f) {
        parseInt(x) -> println("일치함")
        else -> println("기타타")
   }

    when (x) {
        in 1 .. 10 -> println("x는 1이상 10이하")
        !in 10 .. 20 -> println("x는 10이상 20이하에 없음")
        else -> println("x는 어떤 범위에도 없음")
    }

    val str = "안녕하세요"
    val result = when(str) {
        is String -> "문자열"
        else -> false
    }
}

fun parseInt(x: Int): Int {
    return x.toInt()
}
