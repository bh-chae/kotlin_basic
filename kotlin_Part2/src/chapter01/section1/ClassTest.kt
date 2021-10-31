class Car{

    val wheel: Int = 4

    fun start(){
        println("Engine Start")
    }
}

class Bird

fun main() {
    val sonata = Car() //생성자
    println(sonata.wheel)
    sonata.start()
    // 생성자 : 클래스를 통해 객체가 만들어 질 때 기본적으로 호출되는 함수
    // 객체 생성 시 필요한 값을 인자로 설정할 수 있게 한다
    // 생성자를 위해 특별한 함수인 constructor()를 정의

    // 주생성자 : 클래스 명과 함께 기술되며 보통 constructor 키워드 생략
    // 부생성자 : 클래스 본문에 기술되며, 하나 이상의 부생성자를 정의할 수 있다.

}