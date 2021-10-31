package chapter06.section2

import java.io.File

//val param = LinearLayout.layoutParmas(0, LinearLayout.LayoutParams.WRAP_CONTENT)
//param.gravity = Gravity.CENTER_HORIZONTAL
//param.weight = 1f
//param.topMargin =100
//param.bottomMargin = 100
//
////
//
//val param = LinearLayout.layoutParmas(0, LinearLayout.LayoutParams.WRAP_CONTENT).apply{
//    gravity = Gravity.CENTER_HORIZONTAL
//    weight = 1f //param없이 직접 값 지정
//    topMargin =100
//    bottomMargin = 100
//}


////활용 방법 - directory 생성 활용
//
////기존 방법
//fun makeDir(path : String): File {
//    val result = File(path)
//    result.mkdirs()
//    return result
//}
//
////let + also
//fun mkDir(path: String) = path.let{ File(it) }.also{it.mkdirs()}
//
//File(path).apply {mkdir()}