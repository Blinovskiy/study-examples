class BankAccount {
  private var balance = 0

  def increment() = {
    if (balance != Int.MaxValue) {
      balance += 1
    }
  }

  def deposit(value: Int): Unit = {
    balance += value
  }

  def withdraw(value: Int): Unit = {
    if (balance >= value)
      balance -= value
  }

  def current = balance
}

val ba: BankAccount = new BankAccount()