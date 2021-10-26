package chapter04.section2

fun sum (a: Int, b: Int) = a + b

fun mul(a: Int, b: Int) : Int {
    return a * b
}

fun funcFunc(a: Int, b: Int) = sum(a, b) //함수 내부에 인자를 함수로 던져 줌


fun main() {
    val result = sum(10, 10)
    val result2 = mul(sum(10, 5), 20)
    val result3 = funcFunc(120, 23)



    println("result : $result, result2 : $result2, result3 : $result3")
}