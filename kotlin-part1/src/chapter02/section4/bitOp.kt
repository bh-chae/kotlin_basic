package chapter02.section4


fun main() {
    val x = 4 // 0100(2)   4(10)
    val y = 0b0000_01010 //  0101(2) 5(10)
    val z = 0x0f // 0b0000_1111(2) 15(10)

    println("x shl 2 --> ${x.shl(2)}") // 16(10) 0001_0000
    println("x inv -> ${x.inv()}") // -5(10) 11111... ...1011(2)


}