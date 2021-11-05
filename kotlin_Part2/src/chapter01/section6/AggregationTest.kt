package chapter01.section6

// 여러마리의 오리를 위한 List 매개 변수

class Pond(_name: String, _members: MutableList<Duck>){
    //mutableList : 데이터를 가변적으로 구성할 수 있는 콜렉션
    val name: String = _name
    val members: MutableList<Duck> = _members
    constructor(_name: String): this(_name, mutableListOf<Duck>())
}

class Duck(val name: String)

fun main() {
    //두 개체는 서로 생명주기에 영향을 주지 않음
    val pond = Pond("myFavorite")
    val duck1 = Duck("duck1")
    val duck2 = Duck("Duck2")

    //연못에 오리를 추가
    pond.members.add(duck1)
    pond.members.add(duck2)

    //연못에 있는 오리들
    for (duck in pond.members){
        println(duck.name)
    }
}