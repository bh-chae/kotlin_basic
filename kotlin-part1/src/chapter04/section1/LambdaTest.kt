package chapter04.section1

fun main() {

    val result: Int
    val result1: Int
    val result2: Int

    // val mutli = { a: Int, b:Int -> a * b} //일반 변수에 람다식 할당
    val multi : (a: Int, b: Int) -> Int = {a, b -> a*b}
    // 람다식의 선언(a,b)->c = { 람다식의 매개변수 -> 람다식의 처리내용}

    val multi1 : (a: Int, b: Int) -> Int = {a, b ->
        println("a: $a, b: $b")
        a*b} //마지막 식이 반환값이 됨

    val multi2 = {a: Int, b: Int ->
        println("a: $a, b: $b")
        a*b}

    result = multi(4, 510)
    println(result)

    result1 = multi1(240 , 24)
    println(result1)
    result2 = multi2(214 , 24)
    println(result2)


    val nestedLambda : () -> () -> Unit = { { println("Nested Lambda")} }
    nestedLambda()
}