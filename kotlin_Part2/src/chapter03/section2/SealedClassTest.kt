package chapter03.section2

//실드 클래스 선언 방법 첫번째
//실드 클래스는 상태를 정의하고 관리하는데 주로 사용
sealed class Result{
    open class Success(val message: String): Result()
    class Error(val code: Int, val message: String): Result()
}

class Status: Result() //실드 클래스 상속은 같은 파일에서만 가능
class Inside: Result.Success("Status") //내부 클래스 상속

// 실드 클래스 선언 두번째
sealed class Result1

open class Success1(val message: String): Result1()
class Error(val code: Int, val message: String): Result1()

class Status1: Result1() //실드 클래스 상속은 같은 파일에서만 가능
class Inside1: Success1("Status") //내부 클래스 상속




fun main() {
    //Success에 대한 객체 생성
    val result = Result.Success("GooD")
    val result1 = Result.Error(10, "No disk")
    val msg = eval(result)
    val msg1 = eval(result1)
    println(msg)
    println(msg1)
}

fun eval(result: Result): String = when(result){
    is Status -> "in progress"
    is Result.Success -> result.message
    is Result.Error -> result.message
    //모든 조건이므로 else 없음
}