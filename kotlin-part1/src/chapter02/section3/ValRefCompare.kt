package chapter02.section3

fun main() {
    val a: Int = 128
    val b = a

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c

    println(a === b)
    println(a == b)
    println("c==d : ${c==d}")
    println("c===d : ${c===d}")
    println("c===e : ${c===e}")

}