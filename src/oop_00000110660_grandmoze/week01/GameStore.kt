package oop_00000110660_grandmoze.week01

fun calculateDiscount(price: Int) = if (price > 500000) price * 20 / 100 else price * 10 / 100

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 650000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount
}