package chapter04.section2

fun main() {
    val fruit = arrayOf("Banana", "avocado", "appple", "APPle", "kiwi")
    fruit
        .filter{ it.startsWith("a")}
        .sortedBy{ it }
        .map{it.toUpperCase() }
        .forEach{ println(it)}
}