class Money(val dollar: Int, val cent: Int) {
  def +(that: Money): Money = {
    new Money((this.dollar + that.dollar) + (this.cent + that.cent) / 100, (this.cent + that.cent) % 100)
  }

  def -(that: Money): Money = {
    new Money((this.dollar - that.dollar) - (this.cent - that.cent) / 100, (this.cent - that.cent) % 100)
  }

  def ==(that: Money): Boolean = {
    if (this.dollar == that.dollar && this.cent == that.cent) true
    else false
  }

  override def toString: String = dollar + "," + cent
}

val a = new Money(1, 75)
val b = new Money(0, 50)
a + b == new Money(2, 25)
a - b == new Money(1, 25)

b - a