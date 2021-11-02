package chapter01.section4

class Person1(firstName: String, out: Unit = println("[Primary Constructor] Parameter")){ //3
    val fname = println("[Property] Person fNmae : $firstName") //4
    init{//5
        println("[init] Person init block")
    }
    constructor(firstName: String, age: Int, out: Unit=println("[Secondary Constructor] Parameter")): this(firstName){ //2
        println("[Secondary Constructor] Body: $firstName, $age") //6
    }
}

fun main() {
    val p1 = Person1("Kildong", 30) //1
    println()
    val p2 = Person1("Doby")
}