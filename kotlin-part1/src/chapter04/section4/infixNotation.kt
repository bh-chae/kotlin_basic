package chapter04.section3

// 중위 표현법 (Infix Notation)
// - 클래스의 멤버 호출 시 사용하는 점(.)을 생략하고 함수 이름 뒤에
//    소괄호를 생략해 직관적인 이름을 사용
// - 중위 함수의 조건
//     - 멤버 메서드 또는 확장함수
//     - 하나의 매개변수
//     - infix 키워드를 사용하여 정의


fun main() {
    // 일반표현법
    // val mutli = 3.mulitply(10)

    // 중위 표현법
    val multi = 3 multiply  10
    println("multi: $multi")

    val num = 3
    val str = num strPlus "Kotlin" //중위 표현법
    println(str)
}

//Int를 확장하여 mutliply() 함수가 하나 더 추가
infix fun Int.multiply(x: Int): Int{ //infix로 선언되므로 중위 함수
    return this * x
}

infix fun Int.strPlus(x: String): String{
    return "$x version $this"
}