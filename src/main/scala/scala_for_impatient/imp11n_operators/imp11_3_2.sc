class Rational(n: Int, d: Int) {
  //require(d != 0)
  val numer: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
  val denom: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

  def this(n: Int) = this(n, 1)

  def +(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def +(i: Int): Rational =
    new Rational(numer + i * denom, denom)

  def -(that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  def -(i: Int): Rational =
    new Rational(numer - i * denom, denom)

  def *(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def *(i: Int): Rational =
    new Rational(numer * i, denom)

  def /(that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)

  def /(i: Int): Rational =
    new Rational(numer, denom * i)

  override def toString = {
    numer + "/" + denom
  }

  def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a.abs else gcd(b, a % b)
}

val a = new Rational(15, -6)
val b = new Rational(-5, 3)
val c = new Rational(-5, -3)
val d = new Rational(5, 3)
val e = new Rational(0, 3)
val f = new Rational(5, 0)
val g = new Rational(0, 0)