package chapter01.section4

open class Person{
    constructor(firstName: String){
        println("[Person] FirstName : $firstName")
    }
    constructor(firstName: String, age: Int){ //3
        println("[Person] firstName : $firstName, $age")
    }
}

class Developer: Person{
    constructor(firstName: String): this(firstName, 10){ //1
        println("[Developer] $firstName")
    }
    constructor(firstName: String, age: Int): super(firstName, age){ //2
        println("[Developer] $firstName, $age")
    }
}

fun main() {
    val sean = Developer("Sean")
}