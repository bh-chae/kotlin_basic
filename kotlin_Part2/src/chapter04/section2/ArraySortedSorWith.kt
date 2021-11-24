package chapter04.section22

data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
        Product("Snow Ball", 870.00),
        Product("Smart Phon", 999.00),
        Product("Dron", 329.00),
        Product("Mouse", 129.00),
        Product("Keyboard", 329.00),
        Product("Tablet", 1229.00)
    )

    //두 객체의 비교, p1이 크면1, 같으면 0 작으면 -1
    products.sortWith(
        Comparator<Product> {p1, p2 ->
            when{
                p1.price > p2.price -> 1
                p1.price == p2.price -> 0
                else -> -1
            }
        }
    )

    products.forEach{ println(it)}
    println()


    //compareBy를 함께 사용해 두 개의 정보 정렬
    //varargs로 받고 있으면 두 개 이상 사용 가능
    products.sortWith(compareBy({it.name}, {it.price}))
    products.forEach { println(it) }

    println()


    //지정된 필드의 가장 작은/큰 값 골라내기
    println(products.minByOrNull { it.price })
    println(products.maxByOrNull {it.price})

}