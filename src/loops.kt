fun main() {
    //While loop
    var number = 200
    while (number <= 205){
        println("Number is $number")
        number ++
    }

    //Decreament
    var x = 100
    while (x >= 95){
        println("Counter is $x")
        x --
    }

    //Do While loop
    var y = 20
    do {
        println(y)
        y ++
    }
    while (y <= 25)

    //For loop
    var furniture = arrayOf("Table", "Chair", "Desk")
    for (z in furniture)
        println(z)

    var marks = arrayOf(87,90,68,60)
    for (mark in marks)
        println("Mark is $mark" )


    for (number in 30 .. 35){
        println(number)
    }

    for (character in 'a' .. 'd'){
        println(character)
    }
}