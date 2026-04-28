package oop_00000110660_grandmoze.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

}