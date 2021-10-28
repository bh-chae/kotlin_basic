package chapter05.section3

fun main() {
    retFunc3()
}

inline fun inlineLambda3(a: Int, b: Int, out: (Int, Int)-> Unit){
    out(a, b)
}

fun retFunc3() {
    println("Start of retfunc")
    inlineLambda2(13, 3, fun(a, b){ // 일반 익명 함수
        val result = a+b
        if(result > 10) return// 일반 익명 함수, 비지역 반환 없음
        println("Result: $result")
    })//inlineLambda2() 함수 끝
    println("end of retFunc")
}