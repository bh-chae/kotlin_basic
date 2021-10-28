package chapter05.section4

fun main() {
    var amount = 600

    try{
        amount -= 100
        checkAmount(amount)
    } catch(e: Exception){
        println(e.message)
    }
    println("amount : $amount")
}

fun checkAmount(amount: Int){
    if (amount < 1000)
        throw Exception("잔고 부족 $amount 1000 이하")
}