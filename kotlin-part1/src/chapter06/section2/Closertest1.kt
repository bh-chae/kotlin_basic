package chapter06.section2

// 클로저 : 람다식으로 표현된 내부 함수에서 외부범위에 선언된 변수에 접근할 수 있는 개념
// 람다식 안에 있는 변수는 값을 유지하기 위해 람다가 포획한 변수
// 함수의 매개변수에 접근

fun main() {
    val calc = Calc()
    var result = 0 //람다 외부의 로컬 변수
    calc.addNum(2, 3) {x, y -> result = x + y} //클로저
    println(result)

    filterNames(result)
}

class Calc{
    fun addNum(a: Int, b: Int, add: (Int, Int)-> Unit){//람다식 add에는 변화가 없음
        add(a, b)
    }
}

fun filterNames(length: Int){
    val names = arrayListOf("Kim", "Hong", "Go", "Hwang", "Jeon")
    val filterResult = names.filter{
        it.length == length // 바깥 length에 접근
    }
    println(filterResult)
}
