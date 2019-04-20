class Account {
  private var balance = 0

  def withdraw(amount: Int) = balance -= amount

  def deposit(amount: Int) = balance += amount

  def returnBalance() = balance

}
