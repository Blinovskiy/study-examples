val nums0 = List(1, 2, 3)
val nums1 = 1 :: 2 :: 3 :: Nil
val nums2 = Nil.::(3).::(2).::(1)


// Insertion sort
// O(n) = N*N
def isort(xs: List[Int]): List[Int] = xs match {
  case List() => List()
  case y :: ys => insert(y, isort(ys))
}
// O(n) = N
def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  case List() => List(x)
  case y :: ys => if(x > y) y :: insert(x, ys)
  else x :: xs
}

val intList = List(7, 1, 5, 9, 2, 3)
isort(intList)
