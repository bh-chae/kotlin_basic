package chapter05.section5

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100), Pair("D", 400))
    val listRepeated = listOf(2, 2, 3,4, 5,5, 6)

    //elementAt: 인덱스에 해당하는 요소 반환
    println("elementAt: " + list.elementAt(1))

    //elementAtOrElse: 인덱스를 벗어나는 경우 식에 따라 반환 아니면 요소 반환
    println("elementAtOrElse: " + list.elementAtOrElse(10, {2*it}))
    //elementAtOrElse(10){2*it} 과 동일

    //elementAtOrNull: 인덱스를 벗어나는 경우 null 반환
    println("elementAtOrNull: "+ list.elementAtOrNull(10))
}