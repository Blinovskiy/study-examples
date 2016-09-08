// Lecture 5.5 - Reduction of Lists
def sumPM(xs: List[Int]): Int = xs match {
  case Nil => 0
  case y :: ys => y + sumPM(ys)
}

def prodPM(xs: List[Int]): Int = xs match {
  case Nil => 1
  case y :: ys => y * prodPM(ys)
}

val nums = List(4,9,2,-3,1,23,15,-21,1,-8)

sumPM(nums)
prodPM(nums)


def sumRL(xs: List[Int]) = (0 :: xs) reduceLeft((x, y) => x + y)
def prodRL(xs: List[Int]) = (1 :: xs) reduceLeft((x, y) => x * y)

sumRL(nums)
prodRL(nums)


def sumRLU(xs: List[Int]) = (0 :: xs) reduceLeft(_ + _)
def prodRLU(xs: List[Int]) = (1 :: xs) reduceLeft(_ * _)

sumRLU(nums)
prodRLU(nums)



def sumFL(xs: List[Int]) = (xs foldLeft 0)(_ + _)
def prodFL(xs: List[Int]) = (xs foldLeft 1)(_ * _)

sumFL(nums)
prodFL(nums)

def concat[T](xs: List[T], ys: List[T]): List[T]=
  (xs foldRight ys)(_ :: _)


def mapFun[T, U](xs: List[T], f: T => U): List[U] =
  (xs foldRight List[U]())((x,y) => f(x) :: y)

def lengthFun[T](xs: List[T]): Int =
  (xs foldRight 0)((x,y) => y + 1)

lengthFun(nums)
mapFun[Int,Int](nums,x=>x+1)


















