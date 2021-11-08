package chapter02.section1

open class First{
    open val x: Int = 0 //오버라이딩 가능
        get(){
            println("First x : $field")
            return field
        }
    val y: Int = 0 //open 키워드가 없으면 final 프로퍼티
}
class Second : First(){
    override var x: Int = 4 //부모와 구현이 다름
        get(){
            println("Second x : $field")
            return field + 3
        }
    set(value){
        field = value + 30

    }
//    override val y: Int = 3 //err : Overriding 불가
}

fun main() {
    val second = Second()
    println(second.x) //오버라이딩된 두번째 클래스 객체의 x
    second.x = 40
    println(second.x)
    println(second.y) // 부모로부터 상속받은 값
}