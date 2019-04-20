import java.time.LocalDate

import scala.collection.mutable.ArrayBuffer

class Account (dateProvider: DateProvider = new RealDateProvider){

  private var balance: BigDecimal = 0
  private var transactions: ArrayBuffer[Transaction] =  ArrayBuffer()

  def withdraw(amount: BigDecimal) = {
    val transaction = Transaction(dateProvider.now, amount, TransactionType.Withdraw)
    transactions += transaction
    balance -= amount
  }

  def deposit(amount: BigDecimal) = {
    val transaction = Transaction(dateProvider.now, amount, TransactionType.Deposit)
    transactions += transaction
    balance += amount
  }

  def returnBalance() = balance
  def returnTransactions = transactions

}
