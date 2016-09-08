//3 -
val d = Array(1, 2, 3, 4, 5)
val d1 = for (i <- 0 until d.length) yield {
  if (i % 2 == 0) {
    if(i!=d.length-1) {
      val buff = d(i)
      d(i) = d(i + 1)
      d(i + 1) = buff
      d(i)
    }
    else {
      d(i)
    }
  }
  else
    d(i)
}
d1.foreach(println)