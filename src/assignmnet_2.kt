fun printLength(str: String?) {
    if (str != null) {
        println("Length of string = ${str.length}")
    } else {
        println("String is null")
    }
}

fun main() {
    val text1: String? = "Kotlin Git Assignment"
    val text2: String? = null

    printLength(text1) // not null
    printLength(text2) // null
}
