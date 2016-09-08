def isPrime(n: Int): Boolean = (2 until n) forall (x => n % x != 0)

val n = 7

val xss = (1 until n) map (i =>
  (1 until i) map (j => (i, j)))

//  Rules:
//    (xss foldRight Seq[Int]())(_ ++ _) == xss.flattern
//    xs flatMap f == (xs map f).flatten

(1 until n).flatMap(i =>
  (1 until i).map(j => (i, j))).filter(pair => isPrime(pair._1 + pair._2))




case class Person(name: String, age: Int)
val persons = List(Person("Www",21),Person("Qqq",40), Person("Eee",19))
for(p <- persons if p.age > 20) yield p.name
persons.filter(p => p.age > 20).map(p => p.name) // the same as ^

for {
  i <- 1 until n
  j <- 1 until i
  if isPrime(i + j)
} yield (i,j)


def scalarProduct(xs: List[Double], ys: List[Double]) =
  (for((x,y) <- xs zip ys) yield x*y).sum


val v1: List[Double] = List(1.1,2,3.2,4,5)
val v2: List[Double] = List(4.2,7,9.4,1,2)

scalarProduct(v1, v2)