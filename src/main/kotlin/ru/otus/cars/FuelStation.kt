package ru.otus.cars

class FuelStation {
    fun FillUpTheCar(car: Car, value: Int)
    {
        try {
            when (car.tankMouth) {
                is PetrolMouth -> (car.tankMouth as PetrolMouth).fuelPetrol(value)
                is LpgMouth -> (car.tankMouth as LpgMouth).fuelLpg(value)
            }
        }
        catch (e: NotImplementedError) {
            println("Бак взорвался")
        }
    }
}