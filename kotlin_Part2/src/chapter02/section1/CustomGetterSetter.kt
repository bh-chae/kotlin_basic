package chapter02.section1

//커스텀 게터와 세터의 사용

class User3(_id: Int, _name: String, _age: Int){
    val id: Int = _id
    var name: String = _name
        set(value){
            println("The name was Changed")
            field = value.toUpperCase() // 받은 인자를 대문자로 변경, 프로퍼티에 할당
        }
    val age: Int = _age
}

fun main() {
    val user1 = User3(2, "Hyeundae", 35)
    user1.name = "cdcd" //사용자 고유의 출력 코드 (커스텀)
    println("User3.name = ${user1.name}")
}