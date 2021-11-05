package chapter01.section5

open class Base{
    protected  var i = 1 //상속 계열에서만 접근 가능 (cf : Private은 class 내부에서만)
    protected fun protectedFunc(){
        i += 1
        println(i)
    }
    fun access(){
        protectedFunc()

    }

}

class Derived : Base(){ //상속 계열
    var j =  i + 1
    fun derivedFunc(): Int {
        protectedFunc()
        return i
    }
}

class Other{
    fun other(){
        val base = Base()
//        base.i = 3 // 상속 계열에서 벗어남

    }
}


fun main(){
    val base = Base() //생성은 가능
//    base.i // 접근 불가
//    base.protectedFunc() // 접근 불가
    base.access()

    val derived = Derived()
    derived.j = 3
    derived.derivedFunc()
}