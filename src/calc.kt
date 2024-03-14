fun main() {
    println("Simple Calculator")
    println("Enter an operation (+, -, *, /): ")
    val operator = readLine()

    println("Enter the first number: ")
    val num1 = readLine()?.toDouble()

    println("Enter the second number: ")
    val num2 = readLine()?.toDouble()

    if (num1 != null && num2 != null && operator != null) {
        val result = when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> {
                if (num2 != 0.0) {
                    num1 / num2
                } else {
                    "Undefined"
                }
            }
            else -> "Invalid operator"
        }
        println("Result: $result")
    } else {
        println("Invalid input")
    }
}