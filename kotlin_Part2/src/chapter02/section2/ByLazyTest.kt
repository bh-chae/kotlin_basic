package chapter02.section2

//lazy 지연 초기화의 경우 val이 가능


class LazyTest{
    init{
        println("init Block") //2
    }
    private val subject by lazy{ //subject가 접근되는 시점에 Lazy 초기화
        println("lazy initialized") //6
        "Kotlin Programming"//7 lazy 반환값(람다식)
    }
    fun flow(){
        println("not Initialized") // 4
        println("subject one: $subject") //5 최초 초기화 시점
        println("subject two: $subject") //8 이미 초기화된 값 사용
    }
}

fun main() {
    val test = LazyTest() //1
    test.flow() //3
}