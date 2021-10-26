package chapter04.section4

var global = 10

fun main() {

    fun localFunc1() {
        println("localFunc1")
    }

    localFunc1() // 선언 이후에 사용 가능

    println("global : $global")
    global = 15
    val local1 = 15
    println("global : $global")
    println("local1 : $local1")
    userFunc()
    println("final global : $global")
}


fun userFunc() {
    global = 20
    val local1 = 240
    println("UserFunction - global : $global")
    println("UserFunction - local1 : $local1")
}