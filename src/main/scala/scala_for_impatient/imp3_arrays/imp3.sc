import scala.collection.mutable.ArrayBuffer

//1
val a = for (i <- 0 until 10) yield i
val a1 = a.toArray

val b = new Array[Int](10)
for (i <- 0 until b.length) {
  b(i) = i
}
b.foreach(println)

//2
val c = Array(1, 2, 3, 4, 5)
for (i <- 0 until c.length - 1 by 2) {
  var buf = c(i)
  c(i) = c(i + 1)
  c(i + 1) = buf
}
c.foreach(println)

//5
val e = Array(4.3, 1.31, 7.45)
e.sum / e.length

//6
val s1 = Array(-8, 2, 0, 1, 5, 4, 15, 3)
val s2 = s1.sortWith(_ < _)
val s3 = s1.sortWith(_ > _)
val f1 = ArrayBuffer(-8, 2, 0, 1, 5, 4, 15, 3)
val f2 = f1.sortWith(_ < _)
val f3 = f1.sortWith(_ > _)

//7
val g = Array(1, 2, 3, 2, 4, 5, 5, 1)
g.distinct


//9
val t = java.util.TimeZone.getAvailableIDs.filter(x => x.contains("America"))
t.foreach(x => println(x.substring(8)))
val t1 = for (i <- 0 until t.length) yield
t(i).substring(8)
val t2 = t1.toArray

//10
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.Buffer

import java.awt.datatransfer._

val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
val scalaBuffer: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)

scalaBuffer






