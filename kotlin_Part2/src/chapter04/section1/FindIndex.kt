package chapter04.section1

fun <T> find(a: Array<T>, Target: T): Int{
    for (i in a.indices){//indices 는 배열의 유효한 범위 반환
        if(a[i] == Target) return i
    }
    return -1
}

fun main() {
    val arr1: Array<String> = arrayOf("Apple", "Banana", "Cherry", "Durian")
    val arr2: Array<Int> = arrayOf(1, 2, 3, 4)
    
    println("arr.indices ${arr1.indices}") //indices 는 배열의 유효한 범위 반환
    println(find<String>(arr1, "Cherry")) // 요소c의 인덱스 찾기
    println(find(arr2, 2)) //요소2의 인덱스 찾기
}