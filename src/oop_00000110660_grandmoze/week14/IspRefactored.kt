package oop_00000110660_grandmoze.week14

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(doc: String): String
}

class ModernSimplePrinter : Printable {
    override fun print(doc: String) = println("Printing securely: $doc")
}