open class BankAccount (
    public val accountHolderName: String,
    val bankName:String,
    private val balance:Double
){
    protected fun ShowBalance()
    {
        println("Account Holder:$accountHolderName,Balance:$balance")
    }
}
class SavingAccount(
    accountHolderName: String,
    bankName:String,
    balance:Double
):
    BankAccount(accountHolderName , bankName,balance)
{
        fun displayAccountInfo()
        {
            ShowBalance()
        }

    }
fun main()
{
    val Savings = SavingAccount("aparna","SBI BANK",5000.0)
    Savings.displayAccountInfo()
}
