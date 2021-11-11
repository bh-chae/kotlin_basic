package chapter03.section1

//추상 클래스 선언
abstract class Printer{
    abstract fun print() //추상 메서드
}

//하위 클래스를 선언해 상속하고 하위클래스로 인스턴스를 만듦
//Object를 사용해 해당 내용을 생략

val myPrinter = object: Printer(){//객체 인스턴스
    override fun print(){ //추상 메서드의 구현
        println("Print!!!!!!")
    }

}

fun main() {
    myPrinter.print()
}