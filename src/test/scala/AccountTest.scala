import java.time.LocalDate

import org.scalatest._
import Matchers._
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._

import scala.collection.mutable.ArrayBuffer

class AccountTest extends FunSuite with MockitoSugar {

  test("returns 0 balance" ) {
    val account = new Account
    account.returnBalance shouldBe 0
  }

  test("deposit") {
    val account = new Account
    account.deposit(1000)
    account.returnBalance shouldBe 1000
  }

  test("withdraw") {
    val account = new Account
    account.deposit(1000)
    account.withdraw(500)
    account.returnBalance shouldBe 500
  }

  test("return transaction array") {

    val date = mock[DateProvider]

    val date1 = LocalDate.of(2019, 4, 20)
    val date2 = LocalDate.of(2019, 4, 21)

    val account = new Account(date)

    when(date.now) thenReturn(date1, date2)

    account.deposit(1000)

    account.withdraw(500)

    account.returnTransactions should contain allOf(Transaction(date1, 1000, TransactionType.Deposit), Transaction(date2, 500, TransactionType.Withdraw))
  }
}
