class Counter {
  private var value: Int = 2147483644

  def increment(): Int = {
    if (value != Int.MaxValue) {
      value += 1
      value
    }
    else
      throw new ArithmeticException("Max value for [" + value.getClass() + "]")
  }

  def current() = value
}

println(Int.MaxValue)
val c: Counter = new Counter
c.increment()
c.increment()
c.increment()
c.increment()