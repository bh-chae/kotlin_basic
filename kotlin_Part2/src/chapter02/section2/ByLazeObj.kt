package chapter02.section2

class Person3(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false //1 초기화 확인 용

    val person: Person3 by lazy{ //2. lazy를 사용한 person 객체의 지연 초기화
        isPersonInstantiated = true
        Person3("Chae", 24) //3. 이 부분이 Lazy 객체로 반환
    }
    val personDelegate = lazy{ Person3("HOng", 32)} //4.위임 변수를 사용한 초기화

    println("person Init : $isPersonInstantiated")
    println("personDelegate Init : ${personDelegate.isInitialized()}")

    println("Person NAme = ${person.name}") // 5. 이시점에 초기화
    println("PersonDelegate.value.name = ${personDelegate.value.name}") // 6. 이 시점에 초기화

    println("Person Init : $isPersonInstantiated")
    println("personDelegate Init : ${personDelegate.isInitialized()}")

}