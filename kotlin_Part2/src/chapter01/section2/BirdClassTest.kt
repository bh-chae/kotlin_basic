package chapter01.section2

class Bird{ //주생성자

    //프로퍼티
    var name: String
    val wing: Int
    var beak: String

    constructor(_name:String, _wing:Int, _beak:String){ //부 생성자
        this.name = _name
        wing = _wing //바깥의 wing과 다르기에 this 생략가능
        beak = _beak
    }

    constructor(_name:String, _beak:String){ //부 생성자
        this.name = _name
        wing = 2
        beak = _beak
    }

/*    init{
        println("----------inIt Start------------")
        name = name.capitalize()
        println("Name : $name, wing : $wing, beak: $beak")
        println("----------init end-------------")
    }*/


    //method
    fun fly(){
        println("Fly!!!!")
    }
}

fun main() {
    val coco = Bird("CoCoCo", 2, "Long")
    val coco2 = Bird("CoCoCo22",  "short")

    coco.name ="COCO"
    coco.fly()
    println(coco.beak)
    println(coco)
    println("coco2 : Name : ${coco2.name}, wing : ${coco2.wing}, beak: ${coco2.beak}")


}