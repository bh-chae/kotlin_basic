package chapter02.section2

class Person{
    lateinit var name : String // Lateinit을 위한 선언

    fun test(){
        if(!::name.isInitialized){ //프로퍼티의 초기화 여부 판단
            println("not initialized")
        } else{
            println("initialized")
        }
    }
}

fun main() {
    val kildong = Person()
    kildong.test()
    kildong.name = "Killllldong"
    kildong.test()
    println("name = ${kildong.name}")

    person1 = Person2("killdv",  49) //생성자 호출 시점에 초기화
    println("person : ${person1.name} is ${person1.age.toString()}")
}

//객체 생성시 lateinit을 통한 지연 초기화
data class Person2(var name:String, var age: Int)

lateinit var person1 : Person2 //객체 생성의 지연 초기화