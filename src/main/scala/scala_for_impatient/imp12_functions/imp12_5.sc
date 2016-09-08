import scala.math._

def largest(fun: (Int) => Int, inputs: Seq[Int]) = inputs.map(fun(_)).reduceLeft(_ max _)
largest(x => 10 * x - x * x, 1 to 10)


def largest2(fun: (Int) => Int, inputs: Seq[Int]) = inputs.map(fun(_)).max
largest2(x => 10 * x - x * x, 1 to 10)




