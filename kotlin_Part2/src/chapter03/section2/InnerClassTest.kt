package chapter03.section2

interface Swicher{ //1. 인터페이스 선언
    fun on(): String

}

class Smartphone(val model: String){
    private  val cpu = "Exynos"

    inner class ExternalStorage(val size: Int){
        fun getInfo() = "${model}: Installed on $cpu with ${size}GB " //바깥 프로퍼티 접근
    }

    fun powerOn(): String{
        class Led(val color: String){ //지역 클래스 선언 : 임시적으로만 사용됨
            fun blink(): String = "Blinking $color on $model" //외부 프로퍼티로 접근
        }
        val powerStatus = Led("Red") //지역 클래스 사용
        val powerSwitch = object : Swicher{ //익명 객체를 사용해 Switcher의 on을 구현
            override fun on(): String{
                return powerStatus.blink()
            }
        } // 익명(object) 객체 블록의 끝
        //return powerStatus.blink()
        return powerSwitch.on()//익명 객체의 메서드를 사용
    }//powerOn 블록 끝
}

fun main() {
    val mySdcard = Smartphone("S21").ExternalStorage(64)
    println(mySdcard.getInfo())

    val myphon = Smartphone("Note10")
    myphon.ExternalStorage(128)
    println(myphon.powerOn())
}