data class Book(val title:String,val author:String,val price:Double)
class Library{
    private val books=mutableListOf<Book>()
    fun addBook(book:Book)
    {
        books.add(book)
    }
    fun showBooks()
    {
        println("Library Books:")
        for(book in books)
        {
            println("${book.title} by ${book.author},price:${book.price}")
        }
    }
}
fun main()
{
    val library = Library()
    library.addBook(Book("Kotlin in Action","Dmitry Jamerov",550.0))
    library.showBooks()
}