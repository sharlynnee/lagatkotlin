import java.util.Scanner
fun main() {
    println("Enter marks: ")
    val marks = readLine()?.toIntOrNull()

    if (marks != null) {
        val grade = calculateGrade(marks)
        println("Grade: $grade")
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}

fun calculateGrade(marks: Int): String {
    return when (marks) {
        in 80..100 -> "A"
        in 70 until 80 -> "B"
        in 60 until 70 -> "C"
        in 50 until 60 -> "D"
        else -> "E"
    }
}
