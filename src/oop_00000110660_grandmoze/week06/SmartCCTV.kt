package oop_00000110660_grandmoze.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("[$name] Power ON. Menghubungkan ke Wi-Fi...")
        startRecord()
    }

    override fun turnOff() {
        stopRecord()
        println("[$name] Power OFF.")
    }

    override fun startRecord() {
        println("[$name] Sensor gerak aktif: Mulai merekam video...")
    }
}