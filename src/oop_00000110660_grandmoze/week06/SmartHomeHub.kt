package oop_00000110660_grandmoze.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        println("\nMematikan Semua Saklar")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}