val chars = List('a', 'b', 'a', 'c', 'b','a','a','a','a','a','a','a','a')

val t0 = System.nanoTime()
chars.map(f => (f, chars.count(_ == f))).distinct
val t1 = System.nanoTime()
println("1 Elapsed time: " + (t1 - t0) + "ns")



val t2 = System.nanoTime()
chars.groupBy(p => p).mapValues(f => f.size).toList.sortBy(f => f._1)
val t3 = System.nanoTime()
println("2 Elapsed time: " + (t3 - t2) + "ns")




def time[R](block: => R): R = {
  val t0 = System.nanoTime()
  val result = block    // call-by-name
  val t1 = System.nanoTime()
  println("Elapsed time: " + (t1 - t0) + "ns")
  result
}