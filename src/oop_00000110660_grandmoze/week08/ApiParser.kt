package oop_00000110660_grandmoze.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        return try {
            val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" } as String
            val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" } as String

            val type = rawJson["type"] as? String

            when (type) {
                "ELECTRONIC" -> {
                    val warranty = rawJson["warranty"] as? Int ?: 12
                    Electronic(id, name, warranty)
                }
                "CLOTHING" -> {
                    val size = rawJson["size"] as? String ?: "All Size"
                    Clothing(id, name, size)
                }
                else -> null
            }
        } catch (e: IllegalArgumentException) {
            throw e
        }
    }

    fun checkout(product: Product) {
        val (id, detail) = when (product) {
            is Electronic -> product.id to "(Warranty ${product.warrantyMonths})"
            is Clothing -> product.id to "(Size ${product.size})"
        }

        val transactionId = JavaPaymentService.processPayment(id)!!

        val productName = when(product) {
            is Electronic -> product.name
            is Clothing -> product.name
        }

        println("Processing Payment for: $productName $detail")
        println("Transaction ID: $transactionId")
    }
}