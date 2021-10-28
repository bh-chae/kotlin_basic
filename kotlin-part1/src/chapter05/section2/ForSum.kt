package chapter05.section2

fun main() {
    var sum = 0

    for (x in 1..10) sum += x

    println("Sum : $sum")

    //하행 반복 - Downto : 5, 4, 3, 2, 1
    for(i in 5 downTo 1) println(i)
    //필요한 단계 증가 - step : 1, 3, 5
    for (i in 1..5 step 2) println(i)
    //혼합 사용 : 5, 3, 1
    for (i in 5 downTo 1 step 2) println(i)


}

