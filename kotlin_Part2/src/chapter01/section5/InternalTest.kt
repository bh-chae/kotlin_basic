package chapter01.section5

internal class InternalClass{ //모듈 내 사용 가능
    internal var i = 1
    internal fun icFunc(){
        i += 1
    }
    fun access(){
        icFunc()
    }
}

class Other1 {
    internal val ic = InternalClass() //프로퍼티 지정시 인터널로 맞춰야 함
    fun test() {
        ic.i //접근 허용
        ic.icFunc() //접근 허용
    }
}

fun main() {
    val mic = InternalClass() // 생성 가능
    mic.i // 접근 허용
    mic.icFunc() // 접근 허용
}