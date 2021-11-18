package chapter03.section2

interface Score{
    fun getScore(): Int
}

//여러 개의 상수를 선언하고 열거된 값을 조건에 따라 선택할 수 있는 특수한 클래스
//자료형이 동일한 상수를 나열할 수 있음

enum class MemberType(var prio: String) : Score{ //Score를 구현할 열거형 클래스
    NORMAL("Third"){
        override fun getScore(): Int = 100 //구현된 메서드
    },
    SILVER("Second"){
        override fun getScore(): Int = 500
    },
    GOLD("First"){
        override fun getScore(): Int = 1500
    }
}

fun main() {
    println(MemberType.NORMAL.getScore())
    println(MemberType.GOLD)
    println(MemberType.valueOf("SILVER"))
    println(MemberType.SILVER.prio)

    for (grade in MemberType.values()){//모든 값을 가져오기 위한 반복문
        println("grade.name = ${grade.name}, prio = ${grade.prio}")
    }
}