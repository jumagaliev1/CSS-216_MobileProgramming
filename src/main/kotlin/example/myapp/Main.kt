package example.myapp

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.heigh = 60
    myAquarium.printSize()
}

fun main() {
    buildAquarium()
}