package oop_00000110660_grandmoze.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf(
            "id" to "E02",
            "name" to "Mouse",
            "type" to "ELECTRONIC",
            "warranty" to "Not An Integer"
        ),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    println("=== STARTING BATCH PROCESSING ===")

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            product?.let {
                parser.checkout(it)
            } ?: println("[SKIP] Tipe produk tidak dikenal atau null.")

        } catch (e: IllegalArgumentException) {
            println("[ERROR] Data korup tertangkap: ${e.message}")
        }
    }
}