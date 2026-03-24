package oop_00000110660_grandmoze.week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> {
            println("Hati-Hati! Ada monster: ${event.monsterName}!")
        }
        is LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Hore! kamu dapat loot: $name (Damage: $damage, Rarity: $rarity)")
        }
        is GameOver -> {
            println("Permainan Berakhir: ${event.reason}")
        }
        SafeZone -> {
            println("Memasuki Zona Aman. Kamu bisa beristirahat sejenak.")
        }
    }
}