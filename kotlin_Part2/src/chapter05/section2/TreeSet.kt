package chapter05.section2

import java.util.*

fun main() {
    //자바의 java.util.TreeSet선언
    val intsSortedSet: TreeSet<Int> = sortedSetOf(4, 2, 12, 10)
    intsSortedSet.add(6)
    intsSortedSet.remove(4)
    println("IntsSortedSet = $intsSortedSet")
    intsSortedSet.clear() //모든 요소 삭제
    println("IntsSortedSet = $intsSortedSet")

}