package chapter01.section4

open class Base{
    open val x:Int = 1
    open fun f() = println("Base Class f()")
}
class Child: Base(){
    override val x: Int = super.x+1 //Childe x=2
    override fun f() = println("Child Class f()")
    
    inner class Inside{
        fun f() = println("Inside Class f()")
        fun test(){
            f()// 현재 Inner 클래스 = Inside f() 접근
            Child().f() // 바로 바깥 클래스 f()에 접근
            super@Child.f() //Child의 상위 클래스인 Base 클래스의 f() 접근
            println("[Inside] super@child.x: ${super@Child.x}") // Base의 x접근
        }
    }
}

fun main() {
    val c1 = Child()
    c1.Inside().test() // Inner 클래스 Inside의 메서드 test 실행
}