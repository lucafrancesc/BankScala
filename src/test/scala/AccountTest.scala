import org.scalatest._
import Matchers._

class AccountTest extends FunSuite {

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
    val account = new Account
    account.deposit(1000)
    account.withdraw(500)
    account.returnTransanctions()
  }
}

