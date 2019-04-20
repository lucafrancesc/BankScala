import java.time.LocalDate

object TransactionType extends Enumeration {
  val Deposit, Withdraw = Value
}

case class Transaction (date: LocalDate, amount: BigDecimal, transactionType: TransactionType.Value)