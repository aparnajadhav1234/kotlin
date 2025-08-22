class Student(val name: String, val roll: Int, val marks: Int) {

    fun calculateGrade(): String {
        return when {
            marks >= 75 -> "A"
            marks >= 50 -> "B"
            else -> "C"
        }
    }
}

fun main() {
    val s1 = Student("Aparna", 56, 85)
    val s2 = Student("Rahul", 23, 67)
    val s3 = Student("Sneha", 34, 40)

    println("${s1.name} got grade: ${s1.calculateGrade()}")
    println("${s2.name} got grade: ${s2.calculateGrade()}")
    println("${s3.name} got grade: ${s3.calculateGrade()}")
}
