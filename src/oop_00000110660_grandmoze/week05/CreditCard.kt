package oop_00000110660_grandmoze.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran Kartu Kredit sebesar Rp$amount sukses!")
        } else {
            println("[$accountName] Transaksi ditolak: Melebihi limit kartu kredit.")
        }
    }
}