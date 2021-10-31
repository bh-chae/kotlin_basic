package chapter06.section2

/*
코틀린 제공 표준라이브러리
람다식을 사용하는 표준 라이브러리에서 let(), apply(), with(), also(), run() 등 표준 함수 제공
표준 함수들은 확장 함수 형태의 람다식으로 구현 됨
 */

//let()
// 함수를 호출하는 객체 T를 이어지는 block의 인자로 넘기고 block의 결과값 R을 반환
// public inline fun <T, R> T.let(block: (T) -> R): R {... return block(this)}
// 매개변수 block은 T를 매개변수로 받아 R을 반환
// let() 함수 역시 R을 반환
// 본문의 this는 객체 T를 가리키는데, 람다식 결과 부분을 그대로 반환 한다는 뜻
// 다른 메서드를 실행하거나 연산을 수행해야 하는 경우에 사용

fun main() {
    val score: Int? =32

    //일반적인 Null 검사
    fun checkScore(){
        if (score != null){
            println("Score : $score")
        }
    }

    //let을 사용해 null 검사를 제거
    fun checkScoreLet(){
        score?.let{println("Score_l : $it")} //1
        val str = score.let{it.toString()} //2
        println(str)
    }

    checkScore()
    checkScoreLet()

    // let chaining
    var a  = 1
    var b = 2
    a = a.let{it + 2}.let{
        println("a= $a") // it = 복사해서 가져왔기 때문에 a=1이 나옴
        val i = it +b //5
        i
    }
    println(a)

    // 중첩사용
    var x = "Kotlin"
    x.let{ outer ->
        outer.let{ inner ->
            println("Inner is $inner and Outer is $outer") //이때는 it을 사용하지 않고 명시적이름을 사용
        }
    }

    //반환값은 바깥쪽의 람다식에만 적용
    var x1 = "Kotlin!!!!"
    x1 = x1.let{ outer ->
        outer.let{ inner ->
            println("Inner is $inner and Outer is $outer") //이때는 it을 사용하지 않고 명시적이름을 사용
            "Inner String" //반환되지 않음
        }
        "Outer String" // 문자열이 반환되어 x에 할당
    }
    println(x1)
}