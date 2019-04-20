import org.scalatest._
import Matchers._

class AccountTest extends FunSuite {
  test("creates an obj with balance 0" ) {
    val account = new Account
    account.returnBalance shouldBe 0
  }
}

