class Rational(var n: Int, var d: Int) {
  require(d != 0)
  if (n < 0 && d < 0) {
    n = n.abs; d = d.abs
  }

  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

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
    //    if (denom < 0 && numer < 0) +numer.abs +"/"+  Math.abs(denom)
    //    else
    if (denom < 0) "-" + numer + "/" + denom.abs
    else numer + "/" + denom
  }

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

val a = new Rational(15, -6)
val b = new Rational(-5, 3)
val c = new Rational(-5, -3)
val d = new Rational(5, 3)
val e = new Rational(0, 3)
val f = new Rational(5, 0)
val g = new Rational(0, 0)