package chapter01.section6
//연관관계
class Patient(val name: String){
    fun doctorList(d: Doctor){ //인자로 참조
        println("Patient: $name, Docter: ${d.name}")
    }
}

class Doctor(val name: String){
    fun patientList(p: Patient){
        println("Doctor : $name, Patient: ${p.name}")

    }
}

fun main() {
    val doc1 = Doctor("Kim minsu") //객체가 따로 생성됨
    val patient1 = Patient("Kildonghong")

    doc1.patientList(patient1)
    patient1.doctorList(doc1)
}