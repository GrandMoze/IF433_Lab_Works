package oop_00000110660_grandmoze.week03

// 1. Properti name didefinisikan sebagai val agar bersifat Read-only
class Weapon(val name: String) {

    // 2. Properti damage dengan aturan setter khusus
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("PERINGATAN: Damage tidak boleh negatif! Nilai tidak diubah.")
            } else if (value > 1000) {
                println("PERINGATAN: Damage terlalu OP! Paksa ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    // 3. Properti tier sebagai Computed Property, getter
    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}