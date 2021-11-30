package chapter05.section3

fun main() {
    val capitalCityMap: MutableMap<String, String> //선언 시 키와 값의 자료형을 명시
        = mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japan" to "Tokyo")
    println(capitalCityMap.values) //값만 출력
    println(capitalCityMap.keys) //키만 출력
    capitalCityMap.put("UK", "London")
    capitalCityMap.put("USA", "Washington")
    capitalCityMap.remove("China") //요소 삭제
    println(capitalCityMap)
    val addData = mutableMapOf("Vietnam" to "Hanoi")
    // 키가 중복되면 값만 갱신
    capitalCityMap.putAll(addData)
    println(capitalCityMap)
}