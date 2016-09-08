// Lecture 5.1 - More Functions on Lists
val xs = List(0,1,2,3,4,5,6,7,8,9)

xs.head
xs.tail
xs.last // takes steps proportional to length of the list xs (|xs|) // grow: |n|
xs.init

xs.drop(3)
xs.take(3)

val ys = List(10,11,12,13,14,15)

xs ++ ys
xs :+ ys
xs +: ys
xs ++: ys

xs.updated(0,1) // new List

xs.reverse

xs indexOf 4
xs contains 0

def last[T](xs: List[T]): T = xs match {
  case List() => throw new Error("last of empty list")
  case List(x) => x
  case y :: ys => last(ys)
}
last(xs)

def init[T](xs: List[T]): List[T] = xs match {
  case List() => throw new Error("init of empty list")
  case List(x) => List()
  case y :: ys => y :: init(ys)
}
init(xs)

// grow: |n*n|
// xs ::: ys = ys.:::(xs)
def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
  case List() => ys
  case z :: zs => z :: concat(zs, ys)
}

// grow: |n|
def reverse[T](xs: List[T]): List[T] = xs match {
  case List() => xs
  case y :: ys => reverse(ys) ++ List(y)
}

def removeAtMatching[T](n: Int, xs: List[T]): List[T] = xs match {
  case List() => xs
  case y :: ys if n > xs.length => throw new IndexOutOfBoundsException("index out of list length")
  case y :: ys if n == 0 =>  ys
  case y :: ys => y :: removeAtMatching(n-1, ys)
}

def removeAt[T](n: Int, xs: List[T]): List[T] = (xs take n) ::: (xs drop n + 1)


removeAt(1, List('a', 'b', 'c', 'd')) // List(a, c, d)




def flatten(xs: List[Any]): List[Any] = xs match {
  case List() => xs
  case y :: ys => y match {
    case z:List[Any] => flatten(z) ::: flatten(ys)
    case z => z :: flatten(ys)
  }
}


flatten(List(List(1, 1), 2, List(3, List(5, List(8,9,List(10,11))))))
flatten(List(List(List(2,3),1),4,5))
flatten(List(List(1,2,3,List(2,List(2,1,List(1,List(List(4,List(99)),2)),2),3),1),4,5,List(1,List(1,4,4,List(5,5,4)),6,7)))













