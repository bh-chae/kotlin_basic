package chapter01.section6

class Car(val name: String, val power: String){
    private var engine = Engine(power) //Engin 클래스 객체는 car에 의존적

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(poser: String){
    fun start() = println("Engine has been started.")
    fun stop() = println("Engine has been stopped")
}

fun main() {

    var car = Car("Geneciss", "1040000Gps")
    car.startEngine()
    car.stopEngine()

}