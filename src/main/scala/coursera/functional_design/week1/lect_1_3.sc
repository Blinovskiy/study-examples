//Here’s a more convenient version of Generator:
trait Generator[+T] {
  self => // an alias for ”this”.
  def generate: T
  def map[S](f: T => S): Generator[S] = new Generator[S] {
    def generate = f(self.generate)
  }
  def flatMap[S](f: T => Generator[S]): Generator[S] = new Generator[S] {
    def generate = f(self.generate).generate
  }
}

//Some instances:
val integers = new Generator[Int] {
  val rand = new java.util.Random
  def generate = rand.nextInt()
}

def pairs[T, U](t: Generator[T], u: Generator[U]) =
  t flatMap (x => u map (y => (x, y)))

val booleans = integers map (x => x > 0)






