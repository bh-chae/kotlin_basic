package chapter03.section1

fun sum(a: Int, b: Int): Int {
    return a+b
} // 최상위 함수

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun outfunc(name: String): Unit{ //: Unit 생략 가능
    println("Name : $name")
}

fun main() { // 최상위 (Top Level) 함수

    fun sum1(a: Int, b : Int = 32) = a+b // 지역 함수, Default 가능

    val result = sum(2, 4)
    println(result)

    val a = 3
    val b = 3
    val result2 = max(a,b)
    println(result2)
    outfunc("Keimia")
    val result3 = sum1(32)
    println(result3)



}