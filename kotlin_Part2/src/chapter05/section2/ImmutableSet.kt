package chapter05.section2

fun main() {
    //setOf를 이용한 불변형 set 생성
    val mixedTypeSet = setOf("Hellow", 4, 'c', 4.23) //혼합 초기화
    var intSet: Set<Int> = setOf<Int>(1, 4,4,52) //정수형만 초기화 (중복 요소는 하나만 나타남)

    println(mixedTypeSet)
    println(intSet)

}