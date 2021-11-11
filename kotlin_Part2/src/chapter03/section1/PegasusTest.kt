package chapter03.section1

interface Bird{
    val wings: Int
    fun fly()
    fun jump() = println("bird JuMP!!")
}

interface Horse{
    val maxSpeed: Int
    fun run()
    fun jump() = println("Jump!!, max speed: $maxSpeed")
}
//다중상속
class Pegasus: Bird, Horse{
    override val wings: Int
        get() = 2
    override val maxSpeed: Int = 100
    override fun fly() {
        println("Flying!")
    }
    override fun run() = println("Run!!!!!")
    override fun jump() {
        super<Horse>.jump() //구현부를 포함하여 바꾸고자 할때
        println("And JUMP!!!!")
    }
}