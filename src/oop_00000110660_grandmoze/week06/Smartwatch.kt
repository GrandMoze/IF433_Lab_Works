package oop_00000110660_grandmoze.week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layaw OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat hp di sekitar untuk paircing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15w")
    }
}