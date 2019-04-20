import java.time.LocalDate

import org.scalatest._
import Matchers._
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._

class StatementClass extends FunSuite with MockitoSugar {
  test("prints the statement") {
    val statement = new Statement

    val date1 = LocalDate.of(2019, 4, 20)
    val date2 = LocalDate.of(2019, 4, 21)

    val transactions = ArrayBuffer(Transaction(date1, 1000, TransactionType.Deposit), Transaction(date1, 2000, TransactionType.Deposit), Transaction(date2, 500, TransactionType.Withdraw))

    statement.printStatement(transactions) shouldBe
      """Date || Credit || Debit || Balance
        |21/04/2019 || || 500.00 || 2500.00
        |20/04/2019 || 2000.00 || || 3000.00
        |20/04/2019 || 1000.00 || || 1000.00
      """.stripMargin
  }
}
