package chapter04.section1

import javax.xml.bind.Element

open class Animal(val size: Int){
    fun feed() = println("Feeding...")
}

class Cat(val jump: Int): Animal(50)

class Spider(val poison: Boolean): Animal(1)

////1. 형식 매개변수를 Animal로 제한
//class Box1<T>() { //주생성자에서 val만 허용
//    fun getAnimal(): T = element //2. out은 반환 자료형에만 사용할 수 잇음
////    fun set(new: T){ //3. Err. T는 in 위치에 사용할 수 없음
////        element = new
////    }
//
//}

//1. 형식 매개변수를 Animal로 제한
class Box1<out T : Animal>(val element: T) { //주생성자에서 val만 허용, Animal로 제한
    fun getAnimal(): T = element
//    fun setAnimal(New T){ //out일 경우 반환형식으로만 사용 가능
//        element = new
//    }

}

fun main() {
    val c1:Animal = Cat(10)
    val s1 = Spider(true)

    var a1:Animal = c1
    a1 = s1 //4. a1은 Spider의 객체가 됨
    println("s1 : ${a1.size}, ${a1.poison}")

//    val b1: Box1<Animal> = Box1<Animal>()
//    val b2: Box1<Animal> = Box1<Cat>()
//    val b3 = Box1<Spider>()
////    val b4 = Box1<Int>()

    //5. 공변성 - Cat은 Animal의 하위 자료형
    val c2: Box1<Animal> = Box1<Cat>(Cat(10))
    println("2.element.size = ${c2.element.size}")

//    //6. 반대의 경우는 가능하지 않음(In)
//    val c3: Box1<Cat> = Box1<Animal>(10) //Err
//    //7. 자료형이 제한되 Animal과 하위 클래스 이외에 사용할 수 없음
//    val c4: Box1<Any> = Box1<Int>(10)
}