fun main() {
    var languages = arrayOf("Kotlin","Javascript","C++","Python")
    println(languages[1])

    //Reassigning a value
    languages[1] = "PHP"
    println(languages[1])

    //Looping through an array
    for (lang in languages){
        println(lang)
    }

    if ("PHP" in languages){
        println("It exists")
    }
    else{
        println("Does not exist")
    }
}