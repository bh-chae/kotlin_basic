package chapter02.section1

class User1(_id: Int, _name: String, _age: Int){
    //프로퍼티들
    val id: Int = _id
        get() = field // id를 쓰면 재귀, field = id의 Pointer
    // field : 프로퍼티를 참조하는 변수로 보조필드(backing field)로 불림
    // 프로퍼티를 대신할 임시 필드로 만일 프로퍼티를 직접하용하면
    // 게터나 세터가 무한호출 되는 재귀에 빠짐 ==> 스택 오버플로우

    var name: String = _name
        get() = field
        set(value) { // value : 세터의 매개변수로 외부로부터 값을 가져옴
            // 외부의 값을 받을 변수가 되므로 value 대신에 어떤 이름이든 상관 없음
            field = value
        }
    var age: Int = _age
        get() = field
        set(value) {
            field = value + 10 // 커스텀 된 세터
        }

}

fun main() {
    val user2 = User1(1, "Park", 65)
    // user2.id = 4 //val 프로퍼티는 값 변경 불가
    user2.age = 42
    println("User2.age = ${user2.age}")
}