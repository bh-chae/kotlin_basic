package chapter05.section4

fun main() {
    val list1 = listOf("oen", "two", "three")
    // listOf는 불변 리스트 컬렉션 초기화 // 가변성 = mutableListOf()
    val list2: List<Int> = listOf(1,2,3)
    val map1 = mapOf("hi" to 1, "hello" to 2, "Goodbye" to 3)
    println(list1 + "four")
    println(list2 + "Hellow")
    println(list2 -1 )
    println(list1 - "one")
    println(list2 - listOf(3, 4,5)) //일치하는 요소 제거
    println(map1 + Pair("Bye", 4)) //Pair()를 사용한 Map의 요소 추가
    println(map1 - "hello") //일치하는 값 제거
    println(map1 + mapOf("Apple" to 4, "Orange" to 5)) //map 병합
    println(map1 - listOf("hi", "hello"))

    println(list1 + listOf("abc", "def"))
}