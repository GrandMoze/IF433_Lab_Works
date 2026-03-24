package oop_00000110660_grandmoze.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Excalibur Kayu Bapuk", 99, ItemRarity.EPIC)
            return Weapon(epicItem, 100)
        }
    }
}