package chapter03.section1

abstract class Vehicle(val name: String, val color: String, val weight: Double){
    //주 생성자에 정의된 프로퍼티는 비추상(non-Abstract) 프로퍼티

    // 추상 프로퍼티 = 하위 클래스에서 반드시 오버라이드 필요
    abstract val maxSpeed: Double

    // 비추상 프로퍼티 = 인터페이스와 다르게, 상태를 저장할 수 있음
    var year: String = "2008"

    //추상 메서드
    abstract fun start()

    abstract fun stop()

    //비추상 메서드 : {}의 블록 구분처럼 기본적인 구현 필요
    fun displaySpec(){
        println("name: $name, Color: $color, weight: $weight, year: $year, maxSpeed: $maxSpeed")
    } //하위 클래스 모두가 기본적으로 같은 내용을 갖게 하기 위함
}

//구체화된 클래스 car 만들기
class Car(name: String,
          color: String,
          weight: Double,
          override val maxSpeed: Double) : Vehicle(name, color, weight) {
    //1. 주생성자의 프로퍼티가 초기화 되어야 함
    //2. 추상프로퍼티들을 override하여 재정의
    //3. 추상 메서드도 override 하여 재정의
    override fun start() {
        println("Car Started")
    }

    override fun stop() {
        println("Car Stopped")
    }

    fun autoPilotOn(){
        println("Auto Pilot ON")
    }

}

class Motorbike(name: String,
          color: String,
          weight: Double,
          override val maxSpeed: Double) : Vehicle(name, color, weight) {
    //1. 주생성자의 프로퍼티가 초기화 되어야 함
    //2. 추상프로퍼티들을 override하여 재정의
    //3. 추상 메서드도 override 하여 재정의
    override fun start() {
        println("Motorbike Started")
    }

    override fun stop() {
        println("Motorbike Stopped")
    }

}

fun main() {
    var car = Car("Matiz", "Blue", 1000.0, 170.0)
    //var v = Vehicle("Matiz", "Blue", 1000.0, 170.0) // 추상클래스로부터 인스턴스를 생성할 수 없음
    var motorbike = Motorbike("YAMAHA Tmax", "Black", 400.0, 270.0)

    car.year = "2003"
    car.displaySpec()
    motorbike.displaySpec()

    car.start()
    motorbike.start()
    car.stop()
    motorbike.stop()
}