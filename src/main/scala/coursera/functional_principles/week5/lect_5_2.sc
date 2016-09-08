// Lecture 5.2 - Pairs and Tuples
def msort(xs: List[Int]):List[Int] = {
  val n = xs.length / 2
  if (n == 0) xs
  else {
//    def merge(xs: List[Int], ys: List[Int]):List[Int] = xs match {
//      case Nil => ys
//      case x :: xs1 =>
//        ys match {
//          case Nil => xs
//          case y :: ys1 =>
//            if (x < y) x :: merge(xs1, ys)
//            else y :: merge(xs, ys1)
//        }
//    }

    def merge(xs: List[Int], ys: List[Int]):List[Int] =
    (xs, ys) match {
      //case (Nil, Nil) => List()
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (x < y) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
    }

    val (fst, snd) = xs splitAt n
    merge(msort(fst), msort(snd))
  }
}



msort(List(4,9,2,3,1,23,15,21,1,8))