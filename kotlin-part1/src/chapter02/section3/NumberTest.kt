package chapter02.section3

import kotlin.reflect.typeOf

fun main() {
    var test: Number = 12.1
    println("$test")
    println("${test.javaClass.name}")

    test = 12
    println("$test = ${test.javaClass.name}")

    test = 120L
    println("$test = ${test.javaClass.name}")

    test += 12.0f
    println("$test = ${test.javaClass.name}")

}