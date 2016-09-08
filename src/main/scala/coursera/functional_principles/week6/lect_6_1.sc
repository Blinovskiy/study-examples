
val xs = Array(1, 2, 6, -12)
xs map (x => x*2)

val s = "Hello World!"
s filter (c => c.isUpper)
s.filter(_.isUpper)

s exists (c => c.isUpper)
s forall  (c => c.isUpper)

val pairs = List(1, 2, 3) zip s
pairs unzip

s flatMap (c => List('.', c))

xs.sum
xs.product

(1 to 3) flatMap (x => (1 to 3) map (y => (x, y)))


def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
  (xs zip ys).map(xy => xy._1 * xy._2).sum

val v1: Vector[Double] = Vector(1.1,2,3.2,4,5)
val v2: Vector[Double] = Vector(4.2,7,9.4,1,2)

scalarProduct(v1, v2)

def scalarProduct1(xs: Vector[Double], ys: Vector[Double]): Double =
  (xs zip ys).map{case (x, y) => x * y}.sum

scalarProduct(v1, v2)



def isPrime(n: Int): Boolean = (2 until n) forall (x => n % x != 0)

isPrime(5)
isPrime(6)
