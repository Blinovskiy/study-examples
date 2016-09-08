class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def deposit(amount: Double) = {
    balance += amount; balance
  }

  def withdraw(amount: Double) = {
    balance -= amount; balance
  }
}

class BankAccountCommision(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double) ={
    super.deposit(amount)
    super.withdraw(1)
  }

  override def withdraw(amount: Double) ={
    super.withdraw(amount)
    super.withdraw(1)
  }
}

val bankAccount = new BankAccount(200)
val bankAccountCommision = new BankAccountCommision(200)

bankAccount.deposit(100)
bankAccountCommision.deposit(100)


val bankAccount1:BankAccount = new BankAccountCommision(200)
bankAccount1.deposit(100)