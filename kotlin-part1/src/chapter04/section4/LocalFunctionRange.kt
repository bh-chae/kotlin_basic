package chapter04.section4

fun a() = b()// 최상위 함수, b() 함수 선언 위치에 상관없이 사용 가능
fun b() = println("b") // b() 함수의 선언

fun c() {
    fun e() = println("e") 
    fun d() = e() // error! : d()는 지역함수이며 e의 이름을 모름
    // fun e() = println("e") 즉, 먼저 선언 되어야 함
}

fun main() {
    a() // 최상위 함수는 어디서든 호출 가능
    //e() // error! c() 함수에 정의된 e()는 c의 블록({})을 벗어난 곳에서 사용할 수 없음
}