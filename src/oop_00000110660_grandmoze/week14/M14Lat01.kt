package oop_00000110660_grandmoze.week14

class proses_khs {
    fun hitung_nilai_tugas(quiz:Double, tugasMingguan:Double):Double {
        return (quiz*0.3) + (tugasMingguan*0.7)
    }
    fun hitung_nilai_akhir(uts:Double, uas:Double, nilaiTugas:Double, kurikulum: jenis_kurikulum):Double {
        return kurikulum.hitung_bobot(uts, uas, nilaiTugas)
    }
}

interface jenis_kurikulum {
    fun hitung_bobot(uts:Double, uas:Double, tugas:Double):Double
}

class kurikulum_2013: jenis_kurikulum{
    override fun hitung_bobot(uts:Double, uas:Double, tugas:Double):Double {
        return (uts*0.3) + (uas*0.4) + (tugas*0.3)
    }
}

class kurikulum_merdeka: jenis_kurikulum {
    override fun hitung_bobot(uts: Double, uas: Double, tugas: Double): Double {
        return (uts*0.3) + (uas*0.4) + (tugas*0.3)
    }
}

class db_khs {
    fun simpan_na_db(nim:String, nama:String, nilaiAkhir:Double):String {
        return "KHS $nim nama $nama dapat nilai $nilaiAkhir"
    }
    fun load_db(nim:String):String {
        return "Berhasil load data $nim"
    }
}

class manager_hitung_khs {
    fun mulai_perhitungan(quizTugas:Double, aktivitasTugas:Double, uts:Double, uas:Double, kurikulum: jenis_kurikulum):Double {
        val khsMhs = proses_khs()
        val nilaiTugas:Double = khsMhs.hitung_nilai_tugas(quizTugas, aktivitasTugas)
        val nilaiAkhirMhs:Double = khsMhs.hitung_nilai_akhir(uts, uas, nilaiTugas, kurikulum)
        return nilaiAkhirMhs
    }
}

class manager_hitung_db{
    fun mulai_simpan(nimMhs:String, namaMhs:String, naMhs:Double):String {
        val dbMhs = db_khs()
        return dbMhs.simpan_na_db(nimMhs, namaMhs, naMhs)
    }
}

fun main() {
    val mngKhs = manager_hitung_khs()
    val naMhs1:Double = mngKhs.mulai_perhitungan(85.73, 87.30, 70.36, 93.57, kurikulum_2013())
    val naMhs2:Double = mngKhs.mulai_perhitungan(85.73, 87.30, 70.36, 93.57, kurikulum_merdeka())
    
    val manager_db = manager_hitung_db()
    println(manager_db.mulai_simpan("123", "Ucok", naMhs1))
    println(manager_db.mulai_simpan("456", "Joko", naMhs2))
}
