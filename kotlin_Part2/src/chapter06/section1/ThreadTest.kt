package chapter06.section1
//쓰레드 루틴을 만드는 방법?
//클래스 : Thread 클래스를 상속받아 구현하기
class SimpleThread : Thread() {
    override fun run(){
        println("Class Thread ${Thread.currentThread()}")
    }
}

//인터페이스 : Runnable 인터페이스로부터 run() 구현
class SimpleRunnable : Runnable {
    override fun run() {
        println("Interface Thread ${Thread.currentThread()}")
    }

}



fun main() {
    val thread = SimpleThread()
    thread.start()

    val runnable = SimpleRunnable()
    val thread2 = Thread(runnable)
    thread2.start()

    //익명 객체
    object : Thread(){
        override fun run() {
            println("Object Thread: ${Thread.currentThread()}")
        }
    }.start()


    //람다식
    Thread{
        println("Lambda Thread ${Thread.currentThread()}")
    }.start()
}