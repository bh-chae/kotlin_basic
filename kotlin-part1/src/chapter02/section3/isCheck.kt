package chapter02.section3

fun main() {
    val num = 258

    if (num is Int) { //num == int
        print(num)
    } else if (num !is Int) { // num != Int (== (!num is int))
        print("Not Int")
    }
}