package chapter04.section1

open class Parent

class Child: Parent()

class Cup<T>

fun main() {
    // val obj1: Child = Parent() //하위 클래스 객체에 상위 클래스 할당 시 Type Mismatch
    val obj1: Parent = Parent()
    val obj2: Parent = Child() //상위 클래스 객체에 하위 클래스 할당시 가능
    val obj3 = Cup<Parent>()
    //  val obj4: Parent = Cup<Child>() //형식 매개변수에서 상위 클래스 객체에 하위클래스 할당시 불가
    val obj5 = Cup<Child>() //형식이 Cup<Child>
    val obj6: Cup<Child> = obj5  // 형식이 일치하므로 가능



}