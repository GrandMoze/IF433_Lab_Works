package oop_00000110660_grandmoze.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")
    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()
    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()

            val s1 = Student(name, nim, 0.0, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

        } else if (type == 2) {
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }

    // --- TUGAS MANDIRI 1: LIBRARY FINE SYSTEM (CHECKPOINT 8) ---
    println("\n--- SISTEM PEMINJAMAN BUKU ---")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (Hari): ")
    var duration = scanner.nextInt()
    scanner.nextLine()

    if (duration < 0) {
        duration = 1
        println("LOG: Durasi tidak valid, otomatis diubah ke 1 hari.")
    }

    val loan = Loan(title, borrower, duration)
    println("Detail Peminjaman: ${loan.bookTitle} oleh ${loan.borrower} selama ${loan.loanDuration} hari.")
    println("Total Denda: Rp ${loan.calculateFine()}")

    println("\n--- MINI RPG BATTLE ---")

    print("Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Stat Damage: ")
    val heroDmg = scanner.nextInt()
    scanner.nextLine()

    val player = Hero(heroName, heroDmg)
    var enemyHp = 100

    while (player.isAlive() && enemyHp > 0) {
        println("\nHP ${player.name}: ${player.hp} | HP Musuh: $enemyHp")
        print("Menu: 1. Serang, 2. Kabur: ")
        val action = scanner.nextInt()
        scanner.nextLine()

        if (action == 1) {
            player.attack("Musuh")
            enemyHp -= player.baseDamage
            println("Sisa HP musuh: $enemyHp")

            if (enemyHp > 0) {
                val dmgFromEnemy = (10..20).random()
                player.takeDamage(dmgFromEnemy)
                println("Musuh membalas! ${player.name} terkena $dmgFromEnemy damage.")
                println("Sisa HP ${player.name}: ${player.hp}")
            }
        } else if (action == 2) {
            println("Kamu memutuskan kabur!")
            break
        }
    }

    println("\n--- PERTARUNGAN BERAKHIR ---")
    if (enemyHp <= 0) {
        println("Selamat! ${player.name} menang melawan musuh!")
    } else if (!player.isAlive()) {
        println("Yah, ${player.name} gugur dalam pertarungan.")
    }
}