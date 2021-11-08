package chapter02.section2

interface Car{
    fun go(): String
}
class VanImpl(val power: String): Car{
    override fun go() = "는 짐을 적재하며 $power 마력을 가짐"
}
class SportImpl(val power: String): Car{
    override fun go() = "는 경주용으로 사용하며, $power 마력을 가집니다"
}

class CarModel(val model: String, impl: Car): Car by impl{
    fun carInfo() {
        println("$model ${go()}") //참조 없이 각 인터페이스 구현 클래스의 go를 접근
    }
}

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100"))
    val my350z = CarModel("350z 2008", SportImpl("340"))

    myDamas.carInfo() //carInfo에 대한 다형성을 나타냄
    my350z.carInfo()
    //일반적인 Car로 매개변수를 선언하므로 서로 다른 밴과 스포츠 구현 클래스를 사용 가능
    //다형성의 예

}