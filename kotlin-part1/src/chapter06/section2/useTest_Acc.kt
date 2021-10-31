package chapter06.section2

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter

//use()를 사용해 객체를 사용한 후 close()등을 자동적으로 호출해 닫음

// 표준 함수의 정의
//public inline fun <T : Closeable?, R> T.use(block: (T) -> R): R
//public inline fun <T : AutoCloseable?, R> T.use(block: (T) -> R): R //JAVA7 후
// T의 제한된 자료형을 보면 Closeable?로 block은 닫힐 수 있는 개체를 지정해야함


fun main() {

    PrintWriter(FileOutputStream("d:\\test\\output.txt")).use {
        it.println("hello")
    }
}