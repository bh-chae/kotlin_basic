package chapter01.section4

open class Bird(var name: String, var wing: Int, var beak: String, var color: String){

    fun fly() = println("fly wing : $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol")

}

class Parrot(name: String, wing: Int = 2, beak: String, color: String, var language: String="Natural") : Bird(name, wing, beak, color) {
    fun speak() = println("Speak!!! $language")

    override fun sing(vol: Int) { // 부모의 내용과 새로 구현된 내용을 갖음
        super.sing(vol) // 상위 클래스 sing을 수행
        println("I'm Parrot!! the Volum level is $vol")
        speak()
    }
}

fun main() {
    var parrot: Bird = Parrot("Prrot", beak = "Short", color = "Blue")
    parrot.sing(4)

}
