package chapter05.section1

import kotlin.test.assertContains

fun main() {
    //불변형 list 사용
    var numbers: List<Int> = listOf(1,2,3,4,5)
    var names: List<String> = listOf("One", "two", "three")
    var mixed = listOf("One", 12, 42.323, 'c')

    for (name in names){
        println(name)
    }
    for (num in numbers) println(num)
    println()

    println("Mixed : $mixed")
    println(mixed.size)
    println(mixed.indexOf(2))
    println(mixed.get(1))
    println(mixed[0])
    println(mixed.contains(12))
}