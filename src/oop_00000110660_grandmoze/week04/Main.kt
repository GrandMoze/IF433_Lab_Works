package oop_00000110660_grandmoze.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    //Tugas Mandiri 1
    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar(brand = "Tesla Model 3", numberOfDoors = 4, batteryCapacity = 85)
    myElectricCar.openTrunk()
    myElectricCar.honk()
    myElectricCar.accelerate()
}