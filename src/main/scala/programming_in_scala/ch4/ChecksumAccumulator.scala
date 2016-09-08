package programming_in_scala.ch4

/**
 * Created by User on 12/9/2015.
 */
import scala.collection.mutable.Map

// 4.3 Singleton objects
object ChecksumAccumulator {

  private val cache = Map[String, Int] ()

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}