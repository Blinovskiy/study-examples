def swap(a: Int, b: Int) = {
  val arr = Array(a,b)
  arr match {
    case arr: Array[Int] => arr.reverse
    case _ => println("No matches")
  }
}

def swapTup(a: (Int,Int)) = {
  a match {
    case _:(Int,Int) => a.swap
    case _ => println("No matches")
  }
}

swap(1,2)
swapTup((1,2))
