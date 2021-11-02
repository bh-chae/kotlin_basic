package chapter01.section4

open class A {
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}
interface B{
    fun f() = println("B Interface f()") //인터페이스는 기본적으로 Open
    fun b() = println("B Interface b()")
}

class C : A(), B{ //콤마를 사용해야 클래스와 인터페이스를 지정 상속은 한개만 받을 수 있다?
    //컴파일이 되려면 f()가 오버라이딩 되어야 함
    override fun f() = println("C class f()") //1
    fun test(){
        f() //현재 클래스 f()
        b() // 인터페이스 b()  //2
        super<A>.f() // a클래스 f() //3
        super<B>.f() // b클래스 f() //4
    }
}

fun main() {
    val c= C()
    c.test()
}