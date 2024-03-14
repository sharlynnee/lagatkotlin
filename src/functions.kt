fun main() {
    //predefined function/Inbuilt library functions
    println("Hello Kotlin")

    var x = Math.sqrt(169.0)
    println(x)

    var y = Math.round(56.78)
    println(y)

    var z = Math.min(45 ,78)
    println(z)
    var v = Math.max(123,456)
    println(v)
    //Calling a function
    name()
    sum()
    details("Joe",56)
    details("Karimi",21)
}

//Userdefined function

fun name() {
    println("Vincent")
}
fun sum()  {
    var number1 =45
    var number2 = 60
    println(number1 + number2)
}
//Parameter and Argument
fun details(name:String, age:Int){
    println("$name is $age years old")
}