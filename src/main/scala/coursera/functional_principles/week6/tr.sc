def comb(s: String): List[String] = {
  def sum(s: String): List[String] = {
    val res = for {
      i <- 0 until s.length
      j <- i + 1 until s.length
      res = s.charAt(i).toString + s.charAt(j).toString
    } yield res
    res.toList
  }
  val res1: List[String] = s.split("").toList
  if(s.isEmpty)
    List()
  else if(s.length < 4) {
    res1 ::: sum(s)
  }
  else {
    res1 ::: sum(s) ::: sum(s.tail).map(s.head.toString + _)
  }
}



comb("abcde")