package chapter03.section1

fun normalVarargs(vararg a: Int) { // vararg 형 : 인자가 한개가 아닌 여러개도 가능

    for(num in a){
        print("$num ")
    }

}

fun main() {
    normalVarargs(1)
    println()
    normalVarargs(1,2,3,4,5,6)

}