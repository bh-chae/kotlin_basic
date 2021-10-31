package chapter01.section3

open class Bird(var name : String, var wing: Int, var beak: String){ //주생성자 및 프로퍼티 선언

    fun fly(){
        print("Fly")
    }
}

class Lark(name: String, wing: Int, beak: String) : Bird(name, wing, beak){
    fun singHitone(){
        println("Singing HighTone")
    }
}

class Parrot : Bird {
    var language: String
    constructor(name: String, wing: Int, beak: String, language: String): super(name, wing, beak){
        // 부생성자 및 프로퍼티 선언, 주 생성자의 내용을 초기화 할 수 있도록 super(생성자) 사용 (자신의 상위의 프로퍼티를 초기화)
        this.language = language
        // 자신의 프로퍼티를 가리킴
    }
    fun speak(){
        println("Speak: $language")
    }
}

fun main() {
    val lark = Lark("MyLark", 2, "Short")
    val parrot = Parrot("MyParrot", 4, "Long", "Korean")

    println("Lark : name : ${lark.name}")
    println("Parrot : name : ${parrot.name}, lang : ${parrot.language}")

    lark.singHitone()
    lark.fly()

    parrot.speak()
    parrot.fly()
}