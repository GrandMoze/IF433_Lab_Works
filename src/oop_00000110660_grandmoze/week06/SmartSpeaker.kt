package oop_00000110660_grandmoze.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("[$name] Voice assistant aktif.")
    }

    override fun turnOff() {
        println("[$name] Voice assistant non-aktif.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}