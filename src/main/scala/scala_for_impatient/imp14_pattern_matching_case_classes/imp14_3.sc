def swapFirstTwo(arr:Array[Int]) = {
  arr match {
    case arr: Array[Int] if arr.length > 1 => Array(arr(1),arr(0))
    case _ => println("No matches")
  }
}

swapFirstTwo(Array(1,2))
swapFirstTwo(Array(1,2,3))
swapFirstTwo(Array(1))