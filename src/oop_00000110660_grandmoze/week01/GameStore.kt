package oop_00000110660_grandmoze.week01

fun calculateDiscount(price: Int) = if (price > 500000) price * 20 / 100 else price * 10 / 100

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int, userNote: String?) {
    println("STRUK PEMBAYARAN STEAMKW")
    println("Judul Game : $title")
    println("Harga Asli : Rp ${String.format("%,d", originalPrice)}")
    println("Harga Akhir: Rp ${String.format("%,d", finalPrice)}")
    println("Catatan    : ${userNote ?: "Tidak ada catatan"}") // Elvis Operator
}

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 650000
    val userNote: String? = null // Nullable type sesuai requirement

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    // Panggil fungsi dengan NAMED ARGUMENTS (sesuai requirement clean code)
    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice,
        userNote = userNote // Named argument untuk nullable parameter
    )
}