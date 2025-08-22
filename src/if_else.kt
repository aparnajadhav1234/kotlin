fun Sanjivani(score:Int) {
    if (score > 90) {
        println("Excellent")

    } else if (score in 77..90) {
        println("Good")
    } else if (score in 50..74) {
        println("pass")
    } else {
        println("fail")
    }
}


    fun main(){
        val score=14
        Sanjivani(score)
        println("using Expression:${Sanjivani(score)}")
    }

