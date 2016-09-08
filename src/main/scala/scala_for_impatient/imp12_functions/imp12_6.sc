import scala.math._

def largestAt(fun: (Int) => Int, inputs: Seq[Int]) = {
  val b = inputs.map(x => (x, fun(x)))
  b.zipWithIndex.maxBy(_._1._2)._1._1
}
(1 to 10).map(x => {(x, 10 * x - x * x)}).toArray
largestAt(x => 10 * x - x * x, 1 to 10)




val b = List((4, 5), (5, 3), (6, 9), (9, 11), (1,2), (7, 17))
//b.reduceLeft((x:(Int,Int), y:(Int,Int)) => { (x._1 max y._1,x._2 max y._2) })
b.reduceLeft((x, y) => {  (x._1 max y._1, x._2 max y._2) }) //Tuple of max elements

b.zipWithIndex.maxBy(_._1)
b.zipWithIndex.maxBy(_._1)._1
b.zipWithIndex.maxBy(_._1)._1._2


