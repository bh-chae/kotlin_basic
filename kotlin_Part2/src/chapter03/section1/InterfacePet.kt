package chapter03.section1

interface Pet { //인터페으에서는 프로퍼티에 값을 저장할 수 없음 --> val로 선언된 프로퍼티는 게터를 통해 필요 내용 구현 가능
    var category: String // abstract 키워드가 없어도 기본적으로 추상 프로퍼티

    val msgTags: String //val 선언시 게터 구현 가능
        get() = "I'm Your's Lovely Pet"

    fun feeding() //마찬가지로 추상 메서드
    fun patting() { //일반 메서드 : 구현부를 포함하면 일반적인 메서드로 기본이 됨
        println("Keep Patting!!!!") //구현부

    }

    var species: String
}

class Cat(name: String, override var category: String, override var species: String): Pet{
    //인터페이스를 구현하는 클래스는 반드시 추상 프로퍼티, 메서드를 override하여 구현해주어야 함
    override fun feeding(){
        println("Feed The cat a Tuna Can!!!!!!")
    }
}

fun main() {
    val obj = Cat("FFE", "Small","SSS")
    println("Pet Category: ${obj.category}")
    obj.feeding()
    obj.patting()
}