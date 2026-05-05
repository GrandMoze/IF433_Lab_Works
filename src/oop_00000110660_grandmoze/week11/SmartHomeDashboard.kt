package oop_00000110660_grandmoze.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    homeDevices.add(SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
    })

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val acUnit = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acUnit)
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))
}