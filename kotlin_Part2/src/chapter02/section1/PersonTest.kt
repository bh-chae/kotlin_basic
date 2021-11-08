package chapter02.section1

//접근 매서드는 생략(내부적으로 생성)

//주 생성자에 3개의 매개변수 정의
//class User(val id:Int, var name: String, var age:Int)
class User(_id: Int, _name: String, _age: Int){ //임시적인 매개변수(관용적 표현 underbar)
    //프로퍼티들
    val id: Int = _id
    var name: String = _name
    var age:Int = _age
}

fun main() {
    // 게터와 세터의 동작

    val user = User(1, "Chae", 30)

    //게터에 의한 값 획득
    val name = user.name
    //내부적으로 게터에 접근.getName()
    //String name = user.getName() //Getter

    //세터에 의한 값 지정
    user.age = 41

    println("name: $name, ${user.age}")
}