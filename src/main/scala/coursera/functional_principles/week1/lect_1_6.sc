//def abs(x: Double) = if (x < 0) -x else x

def sqrt(x: Double) = {
  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  def isGoodEnough(guess: Double) = Math.abs(guess * guess - x) / x < 0.001
  //def isGoodEnough(guess: Double, x: Double) = abs(guess * guess - x) < x*1e-3

  def improve(guess: Double) = (guess + x / guess) / 2
  sqrtIter(1.0)
}

sqrt(2)
sqrt(4)
sqrt(1e-6)
sqrt(1e6)

sqrt(0.1e-20)
sqrt(1.0e20)
sqrt(1.0e60)
