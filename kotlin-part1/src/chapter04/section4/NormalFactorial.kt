package chapter04.section4

// 일반 재귀함수 (Recursiv Function)
// - 자기 자신을 호출하는 Func.
// - 계속해서 스택에 쌓이게 되는 형태로, 메모리 부족현상 발생 가능 //Stack Overflow

// 꼬리 재귀 함수 (tail recursive function)
// - 스택에 계속 쌓이 방식의 함수가 계속 꼬리를 무는 형태
// - 코틀린 고유의 tailrec 키워드를 사용해 선언

fun main() {
    val num = 4
    val result: Long

    result = factorial(num)
    println("Factorial: $num -> $result")
}

fun factorial(n: Int): Long{
    return if (n == 1) n.toLong() else n * factorial(n-1)
}

//factorial(4)
//4*factorial(3)
//4*(3*factorial(2))
//4*(3*(2*factorial(1)))
//4*(3*(2*1))
