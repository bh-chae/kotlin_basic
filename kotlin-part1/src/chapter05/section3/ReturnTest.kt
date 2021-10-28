package chapter05.section3

fun main() {

}

fun add(a: Int, b: Int): Int {
    return a+ b
    println("실행되지 않는 줄")
}

//return으로 Unit 반환하기
//1. Unit을 명시적으로 반환
fun hello(name: String): Unit { //: Unit 생략가능
    println(name)
    return Unit
}
//2. Unit 이름을 생략한 반환
fun hello1(name: String): Unit{
    println(name)
    return
}
//3. return문 자체를 생략
fun hello2(name: String){
    println(name)
}

