fun main() {

    var username: String = "Kildong" //자료형을 추론하여 결정 가능
    var username2: String
    username2 = "test"
    val count = 304 // 자료형을 안쓸경우 불가
    username = "Hyeonbee"
    println("Username : $username, Count: $count")
    /*
    공부할 내용 : 데이터 타입
    기본형 : 정수형 실수형 문자형 논리형 (byte, short, int, long ...)
      - 스택 영역에 저장 (정적인 것들을 저장)
      - 기본적으로 알고있는 변수-주소 주소지-데이터 형식

    참조형 : 객체, 배열, 함수, 대문자 시작(Int, Long, Short)
      - 힙 영역에 저장 (동적인 것들을 저장)
      - 변수-주소지, 주소지-객체의 변수(프로퍼티) 영역, 프로퍼티 영역-데이터
     https://okayoon.tistory.com/entry/%EC%BD%94%EC%96%B4-%EC%9E%90%EB%B0%94%EC%8A%A4%ED%81%AC%EB%A6%BD%ED%8A%B8-%EB%8D%B0%EC%9D%B4%ED%84%B0-%ED%83%80%EC%9E%85-%EA%B8%B0%EB%B3%B8%ED%98%95-%ED%83%80%EC%9E%85Primitive-Type%EA%B3%BC-%EC%B0%B8%EC%A1%B0%ED%98%95-%ED%83%80%EC%9E%85Reference-Type
     */


    // 정수 자료형 : Long / Int / Short / Byte
    // 부호없는(실험적) : ULong / UInt / UShort / UByte

    // 자료형생략시 기본형으로 Int
    // 접미사, 접두사 사용시
    val exp01 = 123 // Int
    val exp02 = 123L // 접미사L = Long
    val exp03 = 0x0F // 접두사 0x = 16진수표기형 Int = 15
    val exp04 = 0b00001011 // 접두사 0b = 2진수 표기 Int = 11
    //작은 값 사용시
    val exp08: Byte = 127
    val exp09 = 32767 // 명시적으로 지정하지 않아 Short => Int
    val exp10: Short = 32767 // 명시적으로 Short 지정
    // 부호없는 정수
    val uint: UInt = 153u
    val ushort: UShort = 65535u
    val ulong: ULong = 46322342uL
    val ubyte: UByte = 255u
    //큰수
    val number = 1_000_000
    val cardNum = 2134_1242_1244_1244
    val hexVal = 0xAB_CD_EF_12
    val bytes = 0b1101_0010
    //실수
    val exp11 = 3.14 // Double로 추론(Default)
    val exp12 = 3.14F // 식별자를 통해 Float로 추론


}