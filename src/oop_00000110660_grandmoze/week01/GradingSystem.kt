package oop_00000110660_grandmoze.week01

fun main() {
    val name: String = "John Thor"
    val score: Int = 80

    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "A"
        in 70..79 -> "A"
        else -> "D"
    }

    println("Grade kamu: $grade")

    println("Status: ${calculateStatus(score)}")

}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"