package chapter05.section3

fun main() {
    retFunc1()
}

fun inlineLambda1(a: Int, b: Int, out: (Int, Int)-> Unit){
    out(a, b)
}

fun retFunc1() {
    println("Start of retfunc")
    inlineLambda1(1, 3) lit@{ a, b-> //람다식 블록의 시작부분에 라벨을 지정
        val result = a+b
        if(result > 10) return@lit //10보다 크면 탈출 비지역 반환 // 라벨을 사용한 블록의 끝부분으로 변환
        println("Result: $result")//10보다 크면 이문장 진행 못함
    }
    println("end of retFunc") //이부분이 실행 됨
}