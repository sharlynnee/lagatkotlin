fun main() {
    var greeting = "Hello world"
    var firstname = "Sharlene"
    var lastname = "Lagat"


    //string concatenation
    println(firstname + " " + lastname)
    println(firstname.plus(lastname))

    //accessing an element in a string
    println(greeting[6])

    //Determine an index position
    println(greeting.indexOf("world"))
    println(greeting.indexOf('H'))

    //Modifying a string
    println(greeting.uppercase())

    //string interpolation
    println("Hello there, my name is $firstname $lastname ")

    //size of a string
    println(greeting.length)
}