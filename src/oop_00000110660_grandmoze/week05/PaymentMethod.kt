package oop_00000110660_grandmoze.week05

abstract class PaymentMethod(val accountName: String){
    abstract fun processPayment(amount: Double)
}