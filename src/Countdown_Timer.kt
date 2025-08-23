fun main(){
    var restart:String
    do{
        var count = 10
        while (count>=1)
        {
            println(count)
            count--
        }
        println("do you want to restart countdown?(yes/no)")
        restart = readLine()!!.lowercase()

    }
        while(restart == "yes")
     println("Countdown finished.")
}