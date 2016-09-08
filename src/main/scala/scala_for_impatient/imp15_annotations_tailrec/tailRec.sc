import scala.annotation.tailrec

object Util {

  def sum(xs: Seq[Int]): BigInt =
    if (xs.isEmpty) 0 else xs.head + sum(xs.tail)

  @tailrec def sum2(xs: Seq[Int], partial: BigInt): BigInt =
    if (xs.isEmpty) partial else sum2(xs.tail, xs.head + partial)
}

try {
  Util.sum(1 to 100000)
}
catch {
  case e:StackOverflowError => println("Stack overflow")
}
Util.sum2(1 to 100000, 0)





import scala.util.control.TailCalls._

def evenLength(xs: Seq[Int]): TailRec[Boolean] =
  if (xs.isEmpty) done(true) else tailcall(oddLength(xs.tail))
def oddLength(xs: Seq[Int]): TailRec[Boolean] =
  if (xs.isEmpty) done(false) else tailcall(evenLength(xs.tail))

evenLength(1 to 1000000).result