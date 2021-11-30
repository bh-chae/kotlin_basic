package chapter05.section5

fun main() {
    //단순 메서드 체이닝
    val list1 = listOf(1,2,3,4,5)
    val listDefault = list1
        .map{ println("map($it) "); it * it} //1
        .filter{ println("filter($it) "); it % 2 == 0} //2

    println(listDefault)

    val listSeq = list1.asSequence()
        .map{ println("map($it) "); it * it} //1
        .filter{ println("filter($it) "); it%2 ==0} //2
        .toList()
    println(listSeq)
}