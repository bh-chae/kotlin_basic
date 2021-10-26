package chapter03.section3

fun highFunc(sum: (Int, Int) ->Int, a: Int, b:Int): Int {
    return sum(a, b)
}

fun highFunc1(a: Int, b:Int, minux: (Int, Int) ->Int): Int {
    return minux(a, b)
}

fun main() {
    val result = highFunc({x, y -> x + y}, 1, 3)
    println(result)

    val result1 = highFunc1(332, 123) {x, y -> x -y}
    println(result1)
}