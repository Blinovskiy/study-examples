import scala.collection.mutable.ListBuffer

def adjustToPair(fun: (Int, Int) => Int, pair: (Int, Int)): Int = {
  fun(pair._1, pair._2)
}


val pairs = (1 to 10) zip (11 to 20)
pairs.map(elem => (adjustToPair((x, y) => (x + y), elem)))

val res = new ListBuffer[Int]
pairs.foreach(elem => (res += adjustToPair((x, y) => (x + y), elem)))
res


//fun.tupled.
//zipWithIndex.maxBy(_._1)._2
