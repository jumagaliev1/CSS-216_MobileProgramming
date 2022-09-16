package example.myapp

open class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
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
        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
    }
    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
    open val shape = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9
}