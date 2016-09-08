import scala.collection.mutable.ArrayBuffer

val h = Array(-8, 2, 0, 1, 5, 4, 15, 3)
val h1= h.sortWith(_ < _)
val h2 = new ArrayBuffer[Int]

h1.foreach(x => if (x > 0) {h2 += x})
h1.foreach(x => if (x == 0) h2 += x)
h1.foreach(x => if (x < 0) h2 += x)

h2.toString()




