package chapter02.section2

import kotlin.properties.Delegates

fun main() {
    var max : Int by Delegates.vetoable(0){
        prop, old, new ->
        new > old //조건에 맞지 않으면 거부
    }

    println(max)
    max = 30
    println(max)

    //여기서 기존값이 새값보다 크므로 False
    //재할당 거부
    max = 5
    println(max)
}