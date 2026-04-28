package oop_00000110660_grandmoze.week10

class MathBox<T: Number>(val value1: T, val value2: T) {
    fun sum(): Double = value1.toDouble() + value2.toDouble()
}

fun <T> getMax(a: T, b: T): T where T: Comparable<T> {
    return if (a > b) a else b
}