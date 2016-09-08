class BankAccount(initialBalance: Double) {
  protected var privateBalance = initialBalance

  def deposit(amount: Double) = {
    privateBalance += amount
    privateBalance
  }

  def withdraw(amount: Double) = {
    privateBalance -= amount
    privateBalance
  }

  def balance = privateBalance
}

class SavingAccounts(initialBalance: Double) extends BankAccount(initialBalance) {
  private var counter = 0

  def earnMonthltInterest(): Double = {
    counter = 0
    deposit(balance * 0.05) // 5%
  }

  override def deposit(amount: Double) = {
    if (counter < 3) counter += 1
    else super.withdraw(1)
    super.deposit(amount)
  }

  override def withdraw(amount: Double) = {
    if (counter < 3) counter += 1
    else super.withdraw(1)
    super.withdraw(amount)
  }
}

val savingAccounts = new SavingAccounts(200)
savingAccounts.deposit(100)
savingAccounts.deposit(100)
savingAccounts.deposit(100)
savingAccounts.deposit(100)
savingAccounts.withdraw(100)
savingAccounts.deposit(100)
savingAccounts.earnMonthltInterest()
savingAccounts.deposit(100)