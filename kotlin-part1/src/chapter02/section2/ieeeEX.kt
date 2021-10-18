package chapter02.section2

fun main() {
    var num: Double = 0.1

    for (x in 0..999) {  // 시작값..끝값 형태의 범위 연산자 사용
        num += 0.1
    }
    println("num : $num") //num : 100.09999999999859
    // 지수부와 가수부의 제한이 있기에
    //부동 소수점 연산에서 값이 다르게 나옴옴
}