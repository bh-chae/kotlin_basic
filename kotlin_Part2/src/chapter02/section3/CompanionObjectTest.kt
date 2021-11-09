package chapter02.section3

class Person{
    var id: Int = 0
    var name: String = "Youngdeok"
    companion object{ //고정된 static 내부 클래스처럼 정의되어, 아래 메서드는 단일 접근요소로 접근 가능
        // 싱글톤으로 정의 : 싱글톤 : 오직 하나의 값만 허용하는 객체
        //Person 객체를 여러개 생성해도 내부 동반 객체는 오직 한개로 유지
        var language: String = "Korean"
        fun work(){
            println("Working...")
        }
    }
}

class KCustomer{
    companion object{
        const val LEVEL = "INTERMEDIATE"
        // val과 Const를 함께 사용하면 컴파일 시간에 앖이 결정,
        @JvmStatic fun login() = println("Login...") //어노테이션 표기
        // 코틀린 메서드를 자바가 읽어갈 수 있도록 하는 표기
    }
}

fun main() {
    val p = Person()
    println(p.name)

    println(Person.language) // 인스턴스를 생성하지 않고 기본값 사용
    Person.language = "English" // 기본값 변ㅅ경
    println(Person.language) //변경된 내용 출력
    Person.work() //메서드 실행
    // println(Person.name)// name은 companion Object가 아니므로 에러

}