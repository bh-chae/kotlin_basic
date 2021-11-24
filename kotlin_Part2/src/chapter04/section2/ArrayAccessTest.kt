package chapter04.section2

import java.util.Arrays

fun main() {
    val arr = arrayOf(1,2,3,54,5,6,67)
    println(arr.get(2))
    println(arr[4])
    
    println(arr.size)

    for (ele in arr){
        print(ele)
    }
    println(Arrays.toString((arr)))
    println(arr.sum())

    arr.set(1, 9)
    arr[1] = 9
    println(Arrays.toString(arr))

}