package chapter06.section2


//apply() 함수는 also()와 마찬가지로 호출하는 객체 T를 이어지는 Block으로 전달하고 객체 자체인 this를 반환



//public inline fun <T, R> T.let(block: (T) -> R): R = block(this)
//public inline fun <T> T.also(block: (T) -> Unit): T { block(this); return this }
public inline fun <T> T.apply(block: T.() -> Unit): T { block(this); return this }

fun main() {
    data class Person(var name: String, var skills : String)

    var person = Person("Killdong", "Kotlin")
    println(person)

    person.apply{ this.skills = "Swift"    } //this = person 객체를 가리킴
    println(person)

    val returnObj = person.apply {
        name = "Sam" //this 생략 가능 (also는 불가)
        skills = "JAVA" //this없이 객체의 멤버에 여러번 접근
    }

    println(person)
    println(returnObj)

}