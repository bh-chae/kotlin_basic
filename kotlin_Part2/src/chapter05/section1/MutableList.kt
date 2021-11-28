package chapter05.section1

fun main() {
    //가변형 List의 생성 및 추가, 삭제, 변경
    val mutableList: MutableList<String> = mutableListOf<String>("Kildong", "Dooly", "ChelssR")
    mutableList.add("BEN") //추가
    mutableList.removeAt(2) //인덱스 2 삭제
    mutableList[0] = "SEEAN" //인덱스 0을 변경, set(index: Int, element: E)와 같은 역할
    println(mutableList)

    //자료형 혼합
    val mutableListMix = mutableListOf("Android", "Apple", 13, 'x', 12.323)
    println(mutableListMix)



    //불변형 List의 변형
    val names: List<String> = listOf("One", "two", "Three") //불변형 list 초기화

    val mutableNames = names.toMutableList() //새로운 가변형 List
    mutableNames.add("Four")
    println(mutableNames)
}