package chapter02.section3

fun main() {

    var str1: String?
    str1 = null
    println("str1: $str1, length: ${str1?.length}")  //?.(SaveCall) : str이 null이면 뒤에 부분을 실행하지 않음
    //println("str1: $str1, length: ${str1!!.length}")  // !!. : 뒤에 값이 null 일리 없다 쓰지 않는 것이 좋음

    val len = str1?.length ?: -1 // if(str1 != null) str1. --> str1? : 엘비스 표현식
    println("str1: $str1, length: $len")

}