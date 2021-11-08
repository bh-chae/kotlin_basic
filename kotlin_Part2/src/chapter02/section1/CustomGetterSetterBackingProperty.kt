package chapter02.section1

class User4(_id:Int, _name:String, _age:Int){
    val id: Int = _id
    private var tempName: String? = null
    var name: String = _name
        get(){
            if (tempName == null) tempName = "Nonamed!"
            return tempName ?: throw AssertionError("Asserted By Others")
        }
    var age : Int = _age
}

fun main() {
    val user2 = User4(4, "Byenghoon", 32)
    user2.name = "dsaf"
    println("User2.Name = ${user2.name}")
}