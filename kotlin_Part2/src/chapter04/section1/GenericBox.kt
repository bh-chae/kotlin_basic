package chapter04.section1

class Box<T>(a: T){ // 제네릭을 사용해 형식 매개변수를 받아 name에 저장 형식 매개변수 T
    var name = a
}

fun main() {
    val box1 =  Box(1) //1은 Int형, Box<Int>로 유추
    val box1_1: Box<Int> = Box(1)
    val box2 = Box("Kildong")//"Kildong이 String형"
    val box2_1: Box<String> = Box("dkf")

}
// 형식 매개변수 : E(요소), K(Key), N(Number), T(Type), V(Value), S/U/V (2nd 3rd, 4th ..)