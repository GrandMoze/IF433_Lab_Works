package oop_00000110660_grandmoze.week03

fun main() {
    val e = Employee("Budi")

    println("--- Test Validasi Salary ---")

    // Skenario 1: Input salah (negatif)
    println("Mencoba set gaji ke -1000...")
    e.salary = -1000
    println("Gaji saat ini: ${e.salary}")

    println("---------------------------")

    // Skenario 2: Input benar (positif)
    println("Mencoba set gaji ke 5000000...")
    e.salary = 5000
    println("Gaji saat ini: ${e.salary}")
}