package chapter04.section2

import java.util.*

fun main() {
    val b = Array<Any>(10, {0})
    b[0] = 213
    b[1] = 1.2 //자료형
    b[2] = "adsf"
    println(Arrays.toString(b))
}