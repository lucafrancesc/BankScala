import org.scalatest._
import Matchers._

class AccountTest extends FunSuite {

  test("returns 0 balance" ) {
    var account = new Account
    account.returnBalance shouldBe 0
  }

  test("deposit") {
    var account = new Account
    account.deposit(1000)
    account.returnBalance shouldBe 1000
  }

  test("withdraw") {
    var account = new Account
    account.deposit(1000)
    account.withdraw(500)
    account.returnBalance shouldBe 500
  }
}

