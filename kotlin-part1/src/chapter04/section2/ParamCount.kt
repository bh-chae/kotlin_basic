package chapter04.section2

fun main() {
    //매개 변수가 없는 람다식 함수
    noParam({"Hellow Kotlin"})
    noParam{"Hellow Kotlin"} //소괄호 생략, 람다식 마지막 인자로 사용된 함수{}

    //매개 변수가 하나 있는 람다식 함수
    oneParam({a -> "HEllo World $a"}) // 람다식 함수의 인자를 받아들일 변수 필요
    oneParam{a -> "HEllo World $a"} //소괄호 생략
    oneParam{"HEllo World $it"} // it으로 대체, 변수가 하나일 때만 가능

    //매개 변수가 두개 있는 람다식 함수
    moreParma{ a, b -> "Hellow $a $b"} //매개변수 생략 불가
    //매개변수 두 개 중 한 개만 사용하고 싶을 때
    moreParma{ _, b -> "두개중 하나 $b"}

    // 일반 매개변수와 람다식 매개변수를 같이 사용
    withArgs("Arg1", "Arg2", {a, b -> "Hello World $a $b"}) // 1
    //withArgs()의 마지막 인자가 람다식인 경우 소괄호 바깥으로 분리
    withArgs("Arg1", "Arg2"){a, b -> "Hello World $b $a"} //2
}

//매개변수가 없는 람다식 함수가 noParma 함수의 매개변수 out으로 지정
fun noParam(out: () -> String) = println(out())
//out = 람다식  구현부('=이후 내용') out이라는 람다식으로 만들어진 함수내용을 사용한다?

//매개변수가 하나 있는 람다식 함수가 oneParam함수의 매개변수 out으로 지정
fun oneParam(out: (String) -> String){
    println(out("OneParam"))
}

//매개변수가 두개 이상 있는 람다식 함수가 moreParam함수의 매개변수로 지정
fun moreParma(out: (String, String) -> String){
    println(out("OneParam", "TwoParam"))
}

//withArgs 함수는 일반 매개변수 2개를 포함, 람다식 함수를 마지막 매개변수로 갖음
fun withArgs (a: String, b: String, out: (String, String) -> String){
    println(out(a, b))
}