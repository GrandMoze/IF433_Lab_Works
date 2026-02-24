package oop_00000110660_grandmoze.week03

fun main() {
    val e = Employee("Budi")

    println("--- 1. Test Validasi Salary ---")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji saat ini: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar (10%): ${e.tax}")
}