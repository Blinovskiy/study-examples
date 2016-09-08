import scala.math._

val num = 3.14
val fun = ceil _
fun(num)
Array(3.14, 1.42, 2.0).map(fun)


val triple = (x: Double) => 3 * x
Array(3.14, 1.42, 2.0) map ((x: Double) => 3 * x)


def valueAtOneQuarter(f: Double => Double) = f(0.25) // (parameterType)=>resultType
valueAtOneQuarter(ceil _)
valueAtOneQuarter(sqrt _)


def mulBy(factor: Double) = (x: Double) => factor * x
val quintuple = mulBy(5)
quintuple(20)


///////////////////////////////////////////
valueAtOneQuarter((x: Double) => 3 * x)
valueAtOneQuarter((x) => 3 * x)
valueAtOneQuarter(x => 3 * x)
valueAtOneQuarter(3 * _)

val fun1 = 3 * (_: Double)
val fun2: Double => Double = 3 * _


(1 to 9).map(0.1 * _)
(1 to 9) map ("*" * _) foreach (println(_))
(1 to 9) filter (_ % 2 == 0)
(1 to 9) reduceLeft (_ * _)
"Mary had a little lamb" split " " sortWith (_.length < _.length)