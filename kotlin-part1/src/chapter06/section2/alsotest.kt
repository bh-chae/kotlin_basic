package chapter06.section2

import java.io.File

// also는 함수를 호출하는 객체 T를 이어지는 block에 전달하고 객체 T 자체를 반환
// 표준 함수의 정의
public inline fun <T, R> T.let(block: (T) -> R): R = block(this)
public inline fun <T> T.also(block: (T) -> Unit): T { block(this); return this }

//also는 블록 안의 코드 수행 결과와 상관없이 T인 바로 객체 this를 반환
//var m = 1
//m = m.also{it+ 3}
//println(m)


fun main() {
    data class Person(var name: String, var skills : String)

    var person = Person("Killdong", "Kotlin")
    println(person)

    val a = person.let{
        it.skills = "JAVA" //객체의 참조, 따라서 값이 변환
        "Success" // 마지막 문장을 결과로 반환
    }

    println(person)
    println("a: $a") //string

    val b = person.also{
        it.skills = "Android"
        "Fail" //마지막 문장은 사용되지 않음 ==> 무의미함
    }
    println(person)
    println("b : $b")//Person의 객체 b
}


//활용 방법 - directory 생성 활용

//기존 방법
fun makeDir(path : String): File {
    val result = File(path)
    result.mkdirs()
    return result
}

//let + also
fun mkDir(path: String) = path.let{ File(it) }.also{it.mkdirs()}