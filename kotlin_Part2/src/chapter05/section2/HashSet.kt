package chapter05.section2

fun main() {
    val intHashSet: HashSet<Int> = hashSetOf(4,6, 23,63) //불변성 없음
    intHashSet.add(5)
    intHashSet.remove(6)
    println(intHashSet)
}