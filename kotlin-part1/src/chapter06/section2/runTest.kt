package chapter06.section2

////run() 함수는 인자가 없는 익명 함수처럼 동작하는 형태
//public inline fun <R> run(block: () -> R): R = return block()
////객체에서 호출하는 형태 두가지로 사용
//public inline fun <T, R> T.run(block: T.() -> R): R= return block()


fun main() {
    var skills = "Kotline"
    println(skills)

    val a = 10
    skills = run{
        val level = "Kotlin Level :" + a
        level // 반환
    }
    println(skills)


    data class Person(var name: String, var skills : String)

    var person = Person("Killdong", "Kotlin")
    println(person)

    val retrunObj = person.apply{
        this.name = "SEAM"
        this.skills = "Swift"
        "Success" //미사용
    }
    println(person)
    println("retrunObj : $retrunObj")

    val retrunObj2 = person.run{
        this.name = "Doby"
        this.skills = "C#"
        "Fail"
    }
    println(person)
    println("retrunObj2 : $retrunObj2")
}
