package ru.otus.cars

open class TankMouth(protected val tank: Tank) {
    private var isOpen = false

    fun open() {
        when (isOpen) {
            true -> println("Горловина уже открыта")
            else -> {
                isOpen = true
                println("Горловина открыта")
            }
        }
    }

    fun close(){
        when(isOpen){
            false -> print("Горловина уже закрыта")
            else -> {
                isOpen = false
                println("Горловина закрыта")
            }
        }
    }
}

class PetrolMouth(tank: Tank) : TankMouth(tank){
    fun fuelPetrol(liters: Int){
        open()
        println("Старт заправки")
        tank.receiveFuel(liters)
        println("Заправка выполнена")
        close()
    }
}

class LpgMouth(tank: Tank): TankMouth(tank) {
    fun fuelLpg(liters: Int){
        open()
        println("Старт заправки")
        tank.receiveFuel(liters)
        println("Заправка выполнена")
        close()
    }
}
