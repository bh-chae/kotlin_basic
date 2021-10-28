package chapter05.section4

fun main() {
    fun labelBreak() {
        println("labelBreak")
        first@ for(i in 1..5) {
            second@ for (j in 1..5) {
                if (j == 3) break@first
                println("i:$i, j:$j")
            }
            println("after for j")
        }
        println("after for i")
    }
}