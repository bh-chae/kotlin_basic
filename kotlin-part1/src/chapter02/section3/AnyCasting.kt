package chapter02.section3

fun main() {
    var a: Any = 1
    a = 20L
    println("a: $a type : ${a.javaClass.name}")
}