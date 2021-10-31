package chapter06.section2

//인자로 받는 객체를 이어지는 block의 receiver로 전달하며 결과값을 반환
// run() 함수와 기능이 거의 동일, run의 경우 Receiver가 없지만,
// with()에서 receiver로 전달할 객체를 처리

//표준함수
public inline fun <T, R> with(receiver: T, block: T.() -> R): R = receiver.block()
//with는 세이프콜(.?)을 지원하지 않음
//supportActionBar?.let{
//    with(it){
//        setDisplayHoeAsUpEnabled(true)
//        setHomeAsUpIndicator(R.drawable.ic_clear_white)
//    }
//}
fun main() {
    data class Person(var name: String, var skills : String, var email: String? = null)

    var person = Person("Killdong", "Kotlin")
    println(person)

    val result = with(person){
        skills = "Java"
        email = "KD_HO@example.com"
        //기본적으로 Unit 반환, 필요하다면 마지막 표현식 추가 가능
        "Successsssssssssssssssss"
    }
    println(person)
    println("result : $result")
}