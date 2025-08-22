package ru.otus.cars

interface Tank {
    fun getContents(): Int
    fun receiveFuel(liters: Int)
}

class MyTank (val capacity: Int): Tank {
    private var contents = 0

    override fun getContents(): Int = contents

    override fun receiveFuel(liters: Int) {
        contents += liters

        if (contents >= capacity) {
            contents = capacity
            println("Полный бак")
        }
    }
}

