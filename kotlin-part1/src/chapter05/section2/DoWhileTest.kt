package chapter05.section2

fun main() {
     // 5 --> 12345, 23451, 34512
    do {
        print("Enter the Number : ")
        val input = readLine()!!.toInt()

        for (i in 0 until input){
            for (j in 0..(input-1)){
                print( (i + j)% input + 1)

            }
            println()
        }
    } while (input != 0)
}