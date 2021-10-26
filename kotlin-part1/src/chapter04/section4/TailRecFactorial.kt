package chapter04.section4

// tail Recursive Function
// 스택을 사용하지 않음

fun main() {
    val num = 5
    println("Factorial: $num -> ${factorial(num)}")
}

tailrec fun factorial(n: Int, run: Int = 1): Long{
    return if (n ==1 ) run.toLong() else factorial(n-1, run*n)
}

// factorial(5)
// factorial(4, 1*5)
// factorial(3, 4), 5)
// factorial((((1, 2), 3), 4), 5)

//factorial(4)
//4*factorial(3)