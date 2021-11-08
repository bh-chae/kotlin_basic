package chapter02.section2

import kotlin.properties.Delegates

class User{
    //observable은 값의 변화를 감시하는 일종의 콜백 루틴
    var name : String by Delegates.observable("NONAME"){ // 프로퍼티를 위임
        prop, old, new -> // 2. 람다식 매개변수로 프로퍼티, 기존값, 새로운 값
        println("$old -> $new") //3. 이 부분은 이벤트가 발생할 때만 실행 됨

    }
}

fun main() {

    val user = User()
    user.name = "Kildong"
    user.name = "Dolly"
}