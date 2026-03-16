package oop_00000110660_grandmoze.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    val lampuTamu = SmartLamp("L01", "Ruang Tamu")
    val googleNest = SmartSpeaker("S01", "Google Nest Dapur")
    val ezvizGarasi = SmartCCTV("C01", "Ezviz Garasi")
}