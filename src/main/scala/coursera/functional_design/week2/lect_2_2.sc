val str = (1 to 1000).toStream
str(3)
str


def streamRange(lo: Int, hi: Int): Stream[Int] =
  if (lo >= hi) Stream.empty
  else Stream.cons(lo,streamRange(lo+1,hi))


def listRange(lo: Int, hi: Int): List[Int] =
  if (lo >= hi) Nil
  else lo :: listRange(lo + 1, hi)

streamRange(1,10)
listRange(1,10)