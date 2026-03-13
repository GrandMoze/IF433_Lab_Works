package oop_00000110660_grandmoze.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------")
    }
    println("\n=== MATH HELPER ===")
    val helper = MathHelper()

    val luasPersegi = helper.hitungLuas(5)
    println("Luas Persegi (sisi 5): $luasPersegi")

    val luasPersegiPanjang = helper.hitungLuas(10, 5)
    println("Luas Persegi Panjang (10x5): $luasPersegiPanjang")

    val luasLingkaran = helper.hitungLuas(7.0)
    println("Luas Lingkaran (r 7.0): $luasLingkaran")



    println("\n=== SISTEM PEMBAYARAN ===")
    val dompetKu = EWallet("Naufal E-Wallet", 50000.0)
    val kartuKu = CreditCard("Naufal CC", 100000.0)

    val daftarPayment: List<PaymentMethod> = listOf(dompetKu, kartuKu)

    for (pay in daftarPayment) {
        println("Memproses pembayaran untuk: ${pay.accountName}")
        pay.processPayment(75000.0)

        if (pay is EWallet) {
            println("Saldo kurang? Melakukan auto top-up...")
            pay.topUp(50000.0)
            pay.processPayment(75000.0)
        }
    }
}