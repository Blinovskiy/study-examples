class Money(val dollar: Int, val cent: Int) {
  private val money = dollar*100+cent
  def +(that: Money): Money = {
    new Money((this.money+that.money)/100, (this.money+that.money)%100)
  }

  def -(that: Money): Money = {
    new Money((this.money-that.money)/100, (this.money-that.money)%100)
  }

  def ==(that: Money): Boolean = {
    if (this.money == that.money) true
    else false
  }

  override def toString: String = "$"+this.money/100+"."+this.money.abs%100 //money.toString
}

val a = new Money(1, 75)
val b = new Money(0, 50)
a + b == new Money(2, 25)
a - b == new Money(1, 25)

b - a
