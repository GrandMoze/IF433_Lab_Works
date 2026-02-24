package oop_00000110660_grandmoze.week03

fun main() {
    val e = Employee("Budi")

    // 1. Test Validasi Salary
    println("--- 1. Test Validasi Salary ---")
    e.salary = -1000 // Harusnya print Error
    e.salary = 5000000
    println("Gaji saat ini: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()
    // e.performanceRating = 5 // Jika ini di-uncomment, akan Error (Merah) karena private

    // 3. Test Computed Property (Pajak)
    println("Pajak yang harus dibayar (10%): ${e.tax}")
}