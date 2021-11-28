package chapter05.section1

fun main() {
    //가변현 list를 생성하고 자바의 ArrayList로 반환
    val stringList: ArrayList<String> = arrayListOf<String>("Hello","Kotlin", "WOw")
    stringList.add("JAVA")
    stringList.remove("Hello")
    println(stringList)
}