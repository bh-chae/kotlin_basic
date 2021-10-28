package chapter05.section3

fun main() {
    labelBreak()

    labelbreak2()
}

fun labelBreak() {
    println("Label Break")
    for (i in 1..5){
        second@ for (j in 1..5){
            if (j == 3) break
            println("i : $i, j: $j")
        }
        println("after for J")
    }
    println("after for I")
}

fun labelbreak2(){
    println("Label Break")
    first@ for (i in 1..5){
        for (j in 1..5){
            if (j == 3) break@first
            println("i : $i, j: $j")
        }
        println("after for J")
    }
    println("after for I")
}