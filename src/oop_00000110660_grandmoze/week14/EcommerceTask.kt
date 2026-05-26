package oop_00000110660_grandmoze.week14
/*
import java.io.File

class BadOrderProcessor {
    // VIOLATION: Hardcoded File I/O (DIP)
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        // VIOLATION: Kaku jika ada tipe customer baru (OCP)
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90 // Diskon 10%
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        // VIOLATION SRP/DIP: Menulis file langsung di bisnis logic
        file.appendText("$itemName, $finalPrice, $customerType\n")

        // VIOLATION SRP/DIP: Notifikasi terikat kuat dengan sistem order
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}
*/

import java.io.File

// 1. Abstraksi untuk Data Layer (DIP & SRP)
interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

// Implementasi repository menggunakan CSV File (Dengan penanganan aman)
class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")

    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        // Menggunakan standard writer penulisan file yang aman
        file.bufferedWriter().use { writer ->
            file.appendText("$itemName, $finalPrice, $customerType\n")
        }
    }
}

// 2. Abstraksi untuk Layanan Notifikasi (DIP & SRP)
interface NotificationService {
    fun sendNotification(itemName: String)
}

// Implementasi Notifikasi Email
class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// 3. Main Processor yang sudah di-inject abstraksi komponennya
class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName)
    }
}

// 4. Abstraksi untuk Kalkulasi Harga (OCP)
interface PricingStrategy {
    fun calculate(price: Double): Double
    fun getCustomerType(): String
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price
    override fun getCustomerType(): String = "REGULAR"
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90
    override fun getCustomerType(): String = "VIP"
}

// Update Class Processor Utama agar mendukung penuh OCP
class UltimateOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, pricingStrategy: PricingStrategy) {
        val finalPrice = pricingStrategy.calculate(basePrice)
        val customerType = pricingStrategy.getCustomerType()

        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName)
    }
}