package chapter05.section3

fun main() {
    retFunc()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int)-> Unit){
    out(a, b)
}

fun retFunc() {
    println("Start of retfunc")
    inlineLambda(13, 3){ a, b->
        val result = a+b
        if(result > 10) return //10보다 크면 탈출 비지역 반환
        println("Result: $result")//10보다 크면 이문장 진행 못함
    }
    println("end of retFunc")
}