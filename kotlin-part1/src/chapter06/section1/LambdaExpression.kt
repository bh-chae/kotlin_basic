package chapter06.section1

// 람다식 : 항상 중괄호에 묶여 있으며, 중괄호 내 매개변수는 화살표기법 왼쪽에, 오른쪽에는 식
val sum: (Int, Int) -> Int = { x, y -> x + y }
val mul = { x: Int, y: Int -> x * y }

// 매개변수가 한 개인 경우, 매개변수를 생략하고 it으로 표기할 수 있었습니다.
val add: (Int) -> Int = { it + 1 }


//여러개의 식이 있는 경우
val isPositive : (Int) -> Boolean= {
    val isPositive = it > 0
    isPositive //마지막 식 반환
}

val isPositiveLabel: (Int) -> Boolean = number@{
    val isPositive = it > 0
    return@number isPositive //라벨을 사용해 반환
}
