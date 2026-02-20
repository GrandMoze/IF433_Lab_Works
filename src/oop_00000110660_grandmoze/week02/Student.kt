package oop_00000110660_grandmoze.week02

class Student (val name: String, val nim: String, var major: String) {

    // Secondary Constructor
    // Memanggil Primary Constructor dengan nilai default untuk major
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }

    init {
        // Validasi Sederhana: Cek panjang NIM [cite: 30]
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }
}