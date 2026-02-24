package oop_00000110660_grandmoze.week03

fun main() {
    val e = Employee("Budi")

    println("--- 1. Test Validasi Salary ---")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji saat ini: ${e.salary}")

    e.increasePerformance()
    println("Pajak yang harus dibayar (10%): ${e.tax}")

    // --- TUGAS MANDIRI 1 (WEAPON) ---
    println("\n--- Tugas 1: Weapon Testing ---")

    val mySword = Weapon("Excalibur")
    println("Weapon Name: ${mySword.name}")

    println("Mencoba set damage ke -50...")
    mySword.damage = -50
    println("Damage saat ini: ${mySword.damage}")

    println("\nMencoba set damage ke 9999...")
    mySword.damage = 9999
    println("Damage saat ini: ${mySword.damage}")

    println("Tier Senjata: ${mySword.tier}")

    // --- TUGAS MANDIRI 2 (PLAYER) ---
    println("\n--- Tugas 2: Player Testing ---")

    val p = Player("JohnThor")

    println("Menambah 50 XP...")
    p.addXp(50)
    println("Level saat ini: ${p.level}")

    println("\nMenambah 60 XP...")
    p.addXp(60)
    println("Level saat ini: ${p.level}")
}