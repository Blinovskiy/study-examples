import scala.collection.mutable.ArrayBuffer

println("variant 1: ")
val a: ArrayBuffer[Int] = ArrayBuffer(2, 7, -7, 3, -1, 11, 5, -3, 0)
var first = true
val indexes = for (i <- 0 until a.length if first || a(i) >= 0) yield {
  if (a(i) < 0 ) first = false; i
}
indexes
for(j <- 0 until indexes.length) a(j) = a(indexes(j))
a
a.trimEnd(a.length - indexes.length)
a


println("variant 2: ")
val b: ArrayBuffer[Int] = ArrayBuffer(2, 7, -7, 3, -1, 11, 5, -3, 0)
var indexes2 = for (i <- 0 until b.length if b(i) < 0) yield {
 i
}
indexes2=indexes2.reverse
indexes2.dropRight(1)
for(j <- 0 until indexes2.length) b.remove(indexes2(j))
b.toString()
