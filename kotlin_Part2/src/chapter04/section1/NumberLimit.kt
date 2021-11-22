package chapter04.section1

class Calc<T: Number> { //클래스의 형식 매개변수 제한
    fun plus(arg1: T, arg2: T):Double{
        return arg1.toDouble() + arg2.toDouble()
    }

}

fun main(args: Array<String>) {

    val calc = Calc<Int>()
    println(calc.plus(10, 20))

    val calc2 = Calc<Double>()
    val calc3 = Calc<Long>()
    //val calc4 = Calc<String>() //제한된 자료형

    println(calc2.plus(2.6, 42.3))
    println(calc3.plus(5L, 10L))

}