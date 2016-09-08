// Lecture 5.4 - Higher-Order List Functions
val nums = List(4,9,2,-3,1,23,15,-21,1,-8)
val fruits = List("apple", "pineapple", "orange", "banana")

nums filter (x => x > 0)
nums filterNot (x => x > 0)
nums partition (x => x > 0)

nums takeWhile (x => x > 0)
nums dropWhile (x => x > 0)
nums span (x => x > 0)


// packs consecutive duplicates of list elements into sublists
def pack[T](xs: List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case x :: xs1 => (List(x) ::: xs1.takeWhile(y => y == x)) :: pack(xs1.dropWhile(y => y == x))
}

pack(List("a", "a", "a", "b", "c", "c", "a"))
//List(List("a", "a", "a"), List("b"), List("c", "c"), List("a"))

def pack2[T](xs: List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case x :: xs1 =>
    val (first, rest) = xs span (y => y == x)
    first :: pack(rest)
}

pack2(List("a", "a", "a", "b", "c", "c", "a"))

def encode[T](xs: List[T]): List[(T,Int)] = xs match {
  case Nil => Nil
  case x :: xs1 =>
    val (first, rest) = xs span (y => y == x)
    (first.head,first.length) :: encode(rest)
}

encode(List("a", "a", "a", "b", "c", "c", "a"))

def encode2[T](xs: List[T]): List[(T,Int)] =
  pack2(xs) map (ys => (ys.head, ys.length))


encode2(List("a", "a", "a", "b", "c", "c", "a"))