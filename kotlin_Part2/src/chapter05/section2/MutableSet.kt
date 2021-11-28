package chapter05.section2

fun main() {
    //가변형 Set 정의
    val animals = mutableSetOf("Lion", "Dog", "Cat", "Python", "Hippo")
    println(animals)

    //요소 추가
    animals.add("Dog") //이미 있음 --> 변화 x
    println(animals)

    //요소 삭제
    animals.remove("Python")
    println(animals)
}