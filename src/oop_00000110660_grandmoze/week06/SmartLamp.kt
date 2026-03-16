package oop_00000110660_grandmoze.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("[$name] menyala dengan kecerahan 100%.")
    }

    override fun turnOff() {
        println("[$name] dimatikan.")
    }
}