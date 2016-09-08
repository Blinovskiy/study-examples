// Lecture 5.3 - Implicit Parameters
def msort[T](xs: List[T])(lt: (T, T) => Boolean):List[T] = {
  val n = xs.length / 2
  if (n == 0) xs
  else {
    def merge(xs: List[T], ys: List[T]):List[T] =
      (xs, ys) match {
        //case (Nil, Nil) => List()
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (lt(x, y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }

    val (fst, snd) = xs splitAt n
    merge(msort(fst)(lt), msort(snd)(lt))
  }
}

val nums = List(4,9,2,3,1,23,15,21,1,8)
val fruits = List("apple", "pineapple", "orange", "banana")

msort(nums)((x, y) => x < y)
msort(fruits)((x: String, y: String) => x.compareTo(y) < 0)
