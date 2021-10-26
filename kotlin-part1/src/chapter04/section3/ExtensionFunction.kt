package chapter04.section3
//확장 함수 : 클래스의 멤버 함수를 외부에서 더 추가 할 수 있음

fun main() {
    val source = "Hellow Kotlin"
    val target = "Kotlin"
    println(source.getLongString(target))
}

//String을 확장해 getLongString추가
fun String.getLongString(target: String): String =
    if (this.length > target.length) this else target
//this는 확장 대상에 있던 자리의 문자열인 source 객체를 나타냄
//기존의 표준 라이브러리를 수정하지 않고 확장
