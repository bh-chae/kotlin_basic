package chapter05.section3

import java.util.*
import kotlin.collections.HashMap

fun main() {
    //java.util.HashMap의 사용
    val hashMap: HashMap<Int, String> = hashMapOf(1 to "Hellow", 2 to "World")
    println("hashMap = $hashMap")

    //java.util.SortedMap 사용
    val sortedMap: SortedMap<Int, String> = sortedMapOf(1 to "Apple", 2 to "Banana")
    println("sortedMap = $sortedMap")

    //java.util.LinkedHashMap 사용
    val linkedHash: LinkedHashMap<Int, String> = linkedMapOf(1 to "computer", 2 to "Mouse")
    println("linkedHash = $linkedHash")
}