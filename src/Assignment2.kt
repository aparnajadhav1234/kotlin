fun printLength(str:String?)
{
    if(str !=null)
    {
        println("length of string=${str.length}")
    }
    else{
        println("String is null")

    }
}
fun main()
{
    val text1:String?="Kotlin Git Assignmnet"
    val text2:String?=null
    printLength(text1)
    println(text2)
}
