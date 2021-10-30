package chapter06.section1

fun inc(x:Int):Int {
    return x+1
}
//고차함수 : 함수의 매개변수로 함수를 받거나 함수 자체를 반환할 수 있는 함수
fun high(name: String, body:(Int)->Int): Int {
    println("name: $name")
    val x = 0
    return body(x)
}

fun main() {
    // 함수를 이용한 람다식
    val result = high("Sean", {x -> inc(x+3)})

    //소괄호 바깥으로 빼고 생략
    val result1 = high("Sean") {inc(it + 3) }

    // 매개변수 없이 함수의 이름만 사용할 때
    val result2 = high("kim", ::inc) //inc 일반함수 --> 람다식

    //람다식 자체를 넘겨준 형태
    val result3 = high("Sean"){x -> x+3}

    //매개변수가 한개인 경우 생략
    val result4 = high("Sean"){it +3}

    //만일 일반 매개변수가 없고 람다식이 유일한 인자라면 다음과 같이 표현 
    //잘 모르겠음
    //val result5 = highNoArg{it + 3}
}