package chapter04.section2

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

    products.sortBy{it.price}
    products.forEach{ println(it)}
}