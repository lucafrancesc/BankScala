import java.time.LocalDate

object TransactionType extends Enumeration {
  val Deposit, Withdraw = Value
}

case class Transaction (val date: LocalDate, val amount: BigDecimal, val transactionType: TransactionType.Value)