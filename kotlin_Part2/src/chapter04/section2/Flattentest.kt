package chapter04.section2

fun main() {
    val numbers = arrayOf(1,2,3)
    val strs = arrayOf("One", "Two", "Three")
    val simpleArray = arrayOf(numbers, strs) //2차원 배열
    simpleArray.forEach { println(it) }

    val flattenSimpleArray = simpleArray.flatten() //단일배열로 변환
    println(flattenSimpleArray)
}