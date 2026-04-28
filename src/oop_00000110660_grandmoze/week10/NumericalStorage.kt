package oop_00000110660_grandmoze.week10

class MathBox<T: Number>(val value1: T, val value2: T) {
    fun sum(): Double = value1.toDouble() + value2.toDouble()
}