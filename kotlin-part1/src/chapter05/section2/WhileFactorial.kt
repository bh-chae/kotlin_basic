package chapter05.section2

fun main() {
    print("Enter the Number : ")
    var num = readLine()!!.toInt()
    var factorial: Long = 1

    while (num > 0) {
        factorial *=num
        --num
    }
    println("Factorial: $factorial")
}