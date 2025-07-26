fun main(){
    println("Starting program...")
    for (i in 1..5){
        println("number:$i")
        if(i % 2 == 0)
        {
            println("$i is even")

        }
        else
        {
            println("$i is odd")
        }
    }
    println("Program end")
}