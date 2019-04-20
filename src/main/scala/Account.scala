class Account {
  def deposit(i: Int) = balance += i

  private var balance = 0
  def returnBalance() = balance

}
