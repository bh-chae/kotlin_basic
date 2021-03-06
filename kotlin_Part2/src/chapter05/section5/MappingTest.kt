package chapter05.section5

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listWithNull = listOf(1, null, 3, null, 5, 6)

    //map: 컬렉션에 주어진 식을 적용해 새로운 컬렉션을 반환
    println(list.map{it * 2}) //[2, 4, 6, 8, 10, 12]

    //mapIndexed; 컬렉션에 인덱스를 포함해 주어진 식을 적용해 새로운 컬렉션 반환
    val mapIndexed = list.mapIndexed{index, it-> index*it}
    println(mapIndexed) //[0, 2, 6, 12, 20, 30]

    //mapNotNull: null을 제외하고 식을 적용해 새로운 컬렉션 반환
    println(listWithNull.mapNotNull{it?.times(2)}) //[2,6,10,12]

    //flatMap() : 각 요소에 식을 적용후 다시 합쳐 새로운 컬렉션 반환
    println(list.flatMap{listOf(it, 'A')}) //[1, A, 2, A, 3, A, 4, A, 5, A, 6, A]
    val result = listOf("abc", "12").flatMap{it.toList()}
    println(result)

    //groupBy : 주어진 함수의 결과에 따라 그룹화 하여 map으로 변환
    val grpMap = list.groupBy{if (it%2 ==0) "even" else "Odd"}
    println(grpMap) //{Odd=[1, 3, 5], even=[2, 4, 6]}

}