class Car(val make: String, val model: String, val year: Int, var mileage: Double) {

    fun details() {
        println("Car: $make $model ($year)")
        println("Mileage: $mileage km")
    }

    fun drive(miles: Double) {
        mileage += miles
        println("Drove $miles km, updated mileage = $mileage km")
    }
}

fun main() {
    val car = Car("Toyota", "Corolla", 2020, 15000.0)

    car.details()
    car.drive(120.0)
    car.details()
}
