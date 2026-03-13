package oop_00000110660_grandmoze.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran E-Wallet sebesar Rp$amount sukses! Sisa saldo: Rp$balance")
        } else {
            println("[$accountName] Gagal: Saldo E-Wallet tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Berhasil top up Rp$amount. Saldo sekarang: Rp$balance")
    }
}