package chapter03.section2

fun avgFunc (initial :Float, vararg numbers: Float): Double {
    var result  = 0f
    for (num in numbers) {
        result += num
    }
    println("result : $result, numbers.size : ${numbers.size}")
    val avg = result / numbers.size
    return avg.toDouble()
}

fun main() {
    val result = avgFunc(5f, 100f, 90f, 80f)
    println("avg result: $result")
}