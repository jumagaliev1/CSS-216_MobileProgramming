package example.myapp

class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    init {
        println("aquarium initializing")
    }
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm")
        println("Volume: $volume liters")
    }
    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }
    val volume: Int
        get() = width * height * length / 1000
}