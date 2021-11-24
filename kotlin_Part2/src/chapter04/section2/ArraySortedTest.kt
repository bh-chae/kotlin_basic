package chapter04.section2

import java.util.*

fun main() {
    val arr = arrayOf(8, 3,5, 4, 3,2,6,9, 1,4)

    //1. 정렬된 배열 산출
    val sortedArr = arr.sortedArray()
    println(Arrays.toString(sortedArr))
    val sortedArrds = arr.sortedArrayDescending()
    println(Arrays.toString(sortedArrds))

    // 2. 원본 데이터 정렬
    arr.sort(1, 4) //부분적으로 sorting (index)
    println(Arrays.toString(arr))
    arr.sortDescending(1, 4) //부분적으로 sorting (index)
    println(Arrays.toString(arr))

    //3. List 변환
    val listSorted: List<Int> = arr.sorted()
    val listDesc: List<Int> = arr.sortedDescending()
    println("LST: " + listSorted)
    println("LST: " + listDesc)

    //4. SortBy를 이용한 특정 표현식에 따른 정렬
    val items = arrayOf<String>("Dog", "Cat", "Lion", "Kangaroo", "Popo")
    items.sortBy { item -> item.length }
    println(Arrays.toString(items))
}