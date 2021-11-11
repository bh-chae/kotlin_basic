package chapter03.section1

interface Nameable{
    var name: String
}

class StaffName : Nameable{
    override var name: String = "SEAN"
}

class Work: Runnable{ //스레드실행을 위한 인터페이스
    override fun run() {
        println("Working")
    }

}

//각 매개변수에 해당하는 인터페이스를 위임
class Person(name: Nameable, work:Runnable) : Nameable by name, Runnable by work
// 위임을 통해 클래스 내용에 바로 접근

fun main() {
    val person = Person(StaffName(), Work()) //생성자를 사용해 객체 바로 전달
    println(person.name) //3. StaffName 클래스 name에 접근
    person.run() // 4. Work 클래스의 run에 접근
}