package chapter01.section5

private class PrivateTest{
    private var i =1
    private fun privateFunc(){
        i += 1
        println(i)
    }
    fun access() { // public
        privateFunc()


    }

}

class OtherClass{ //분리된 클래스에서는 Private을 가져올 수 없음
    // var pc = PrivateTest() // 외부에 공개하지 않는 형태를 요구함
    fun test(){
        val pc = PrivateTest()
        // pc.i = 3 i / Fun 모두 Private으로 해당 클래스 내에서만 사용됨
        // pc.privateFunc()
    }
}

fun main() {
    val pc = PrivateTest()
    // pc.i = 3 i / Fun 모두 Private으로 해당 클래스 내에서만 사용됨
    // pc.privateFunc()
    pc.access()
}

fun TopFunction(){
    val tpc = PrivateTest() // 객체 생성 가능  toplevel 함수이기 때문에
}
