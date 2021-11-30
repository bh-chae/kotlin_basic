package chapter05.section5

fun main() {
    val nums: Sequence<Int> = generateSequence(1){ it +1 }
    //시드 값 = 1, 1씩 증가

    //take()를 사용하여 원하는 요소 개수 만큼 획득
    //toList() List컬렉션으로 반환

    println(nums.take(10).toList())

}