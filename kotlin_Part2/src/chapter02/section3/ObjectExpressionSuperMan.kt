package chapter02.section3

open class Superman(){
    fun work() = println("Taking Photos")
    fun talk() = println("Talking with People")
    open fun fly() = println("Flying in the air")
}

fun main() { //하위 클래스를 만들지 않고도 새로운 구현을 퐇람 가능
    val pretendedMan = object: Superman() { //1) Object 표현식으로 fly 구현의 재정의
        //접근 시점에 인스턴스가 생성
        override fun fly() = println("I'm not a real Superman. I can't Fly!")
        //어떤 클래스에 메서드를 오버라이딩 하기 위해서는 하위 클래스를 정의하고
        //해당 매서드를 재정의하고 객체를 생성해야 했지만, Objcet 표현식은 이런 과정이 생략
    }
    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()

}