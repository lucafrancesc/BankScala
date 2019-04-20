import scala.collection.mutable.ArrayBuffer

class Statement {
  private val heading: String = "Date || Credit || Debit || Balance"

  def printStatement(transactions: ArrayBuffer[Transaction]): String = {
    if(transactions.isEmpty) return heading
    var balance: BigDecimal = 0
    var formattedTransactions: ArrayBuffer[String] = ArrayBuffer()
    for(transaction <- transactions) {

      val formatted = if (transaction.transactionType == TransactionType.Deposit) {
        balance += transaction.amount
        "%.2f".format(transaction.amount) + " ||"
      } else {
        balance -= transaction.amount
        "|| " + "%.2f".format(transaction.amount)
      }

      formattedTransactions += (
        transaction.date.toString + " || " + formatted + " || " + "%.2f".format(balance)

        )
    }

    heading + "\n" + formattedTransactions.reverse.mkString("\n")
  }

}
