package oop_00000110660_grandmoze.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")

