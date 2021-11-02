package chapter01.section3
//다형성Polimopulism
// Overriding : 기능을 완전히 다르게 바꾸어 재설계
// 서로 다른 기능을 수행할 수 있도록 함
// OverLoading : 기능은 같지만 인자가 다름
// 인자가 달라도 print 기능은 같음

open class Bird(var name : String, var wing: Int, var beak: String){ //주생성자 및 프로퍼티 선언

    open fun fly(){  //메서드 프로퍼티도 오버라이드 가능
        print("Fly")
    }
}

class Lark(name: String, wing: Int, beak: String) : Bird(name, wing, beak){

    override fun fly(){
        println("QuickFly")
    }

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

    override fun fly(){
        println("SlowFly")
    }

    fun speak(){
        println("Speak: $language")
    }
}

fun main() {
    val lark: Bird = Lark("MyLark", 2, "Short")
    val parrot = Parrot("MyParrot", 4, "Long", "Korean")

    println("Lark : name : ${lark.name}")
    println("Parrot : name : ${parrot.name}, lang : ${parrot.language}")

    //lark.singHitone()
    lark.fly()

    parrot.speak()
    parrot.fly()
}