package chapter05.section1

fun main() {
    println("Enter the Score: ")
    val score = readLine()!!.toDouble()

    var grade: Char = 'F'

    if(score > 90.0){
        grade = 'A'
    } else if (score in 80.0 .. 90.0){
        grade = 'B'
    } else if (score > 70 && score <= 79.9){
        grade = 'C'
    }

    println("Score : $score, grade : $grade")

}