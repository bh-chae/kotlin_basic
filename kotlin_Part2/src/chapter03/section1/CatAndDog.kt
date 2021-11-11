package chapter03.section1

open class Animal(val name: String)

//1. feeding의 구현을 위해 인터페이스 pet 지정
class Dog(name: String, override var category: String): Animal(name), Pet{
    override var species: String = "Dog"
    //계약조건(인터페이스)에 한가지 조항을 더넣는 작업
    // 종에 대한 프로퍼티를 가지도록 함

    override fun feeding(){
        println("Feed the Dog a bone")
    }
}
class Master{
    fun playWithPet(pet: Pet) { //2. 각 애완동물 종류에 따라 오버로딩 됨
        println("Enjoy With my ${pet.species}")
    }
}

fun main() {
    val master = Master()
    val dogg = Dog("Toto","Big!!!")
    val cat = Cat("Fefe", "Small and cute", "Cat")
    master.playWithPet(dogg)
    master.playWithPet(cat)
}

//다중상속
//클래스는 기본적으로 다중 상속을 지원하지 않음
//인터페이스 여러개를 하나의 클래스에서 구현하는 것이 가능 --> 다중 상속과 같은 효과