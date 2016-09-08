import scala.math._

val a = Array(1,5,3,2,11,8,4,6,3,1,2,1)
a.reduceLeft(max(_,_))

a.reduceLeft(_ max _)

a.max

