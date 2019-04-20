import org.scalatest._
import Matchers._
import org.scalatest.easymock.EasyMockSugar

class StatementClass extends FunSuite with EasyMockSugar{
  test("prints the statement") {
    val account = mock[Account]
    val statement = new Statement
    account.returnBalance andReturn ( 42 )
    statement.printStatement shouldBe
      """Date || Credit || Debit || Balance
        |14/01/2019 || || 500.00 || 2500.00
        |14/01/2019 || 2000.00 || || 3000.00
        |14/01/2019 || 1000.00 || || 1000.00
      """.stripMargin
  }
}
