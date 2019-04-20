import org.scalatest._
import Matchers._

class AccountTest extends FunSuite {
  var account = new Account
  test("returns 0 balance" ) {
    account.returnBalance shouldBe 0
  }

  test("deposit") {
    account.deposit(1000)
    account.returnBalance shouldBe 1000
  }
}

