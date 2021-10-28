package chapter05.section3


fun main() {
    retFunc2()
}

inline fun inlineLambda2(a: Int, b: Int, out: (Int, Int)-> Unit){
    out(a, b)
}

fun retFunc2() {
    println("Start of retfunc")
    inlineLambda2(13, 3) { a, b->
        val result = a+b
        if(result > 10) return@inlineLambda2 //10보다 크면 탈출 비지역 반환
        println("Result: $result")//10보다 크면 이문장 진행 못함
    }
    println("end of retFunc")
}