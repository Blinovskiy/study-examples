def f(x: Double) = if (x >= 0) Some(math.sqrt(x)) else None
def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None

def compose(fun1: Double => Option[Double], fun2: (Double) => Option[Double]) = {
  (x: Double) => if (fun1(x).isDefined && fun2(x).isDefined) {
    fun1(x)
    fun2(x)
  }
  else
    None
}


val h = compose(f, g)
h(-1)
h(1)
h(2)
