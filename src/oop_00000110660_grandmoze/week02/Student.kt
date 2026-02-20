package oop_00000110660_grandmoze.week02

// Refactor dengan Default Argument
class Student (
    val name: String,
    val nim: String,
    var gpa: Double = 0.0,
    var major: String
) {

    constructor(name: String, nim: String) : this(name, nim, 0.0, "Non-Matriculated") {
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