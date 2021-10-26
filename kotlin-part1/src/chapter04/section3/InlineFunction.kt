package chapter04.section3

inline fun shortFunc(a: Int, crossinline b: (Int) -> Unit) { //crossinline : 비 지역반환을 금지시키는 키워드
//inline : 코드 내용을 모두 main function 안으로, noinline : 코드안이 아닌 다시 코드 밖에서 실행
    println("Heelow")
    b(a)
    println("Goodbye")
}


fun main() {
    shortFunc(3) {
        println("a: $it")
        //return // 비지역 반환 Goodbye가 실행되지 않음
    }
}