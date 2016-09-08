val prices1 = List(5.0, 20.0, 9.95)
val quantities1 = List(10, 2, 1)
//(prices1 zip quantities1) map { p => p._1 * p._2 }
(prices1 zip quantities1) map Function.tupled(_ * _)



val prices2 = List(5.0, 20.0, 9.95)
val quantities2 = List(10, 2, 1)
val discount2 = List(17, 7, 5)

(prices2 zip quantities2 zip discount2) map { p => p._1._1 * p._1._2 - (p._2*0.01) }

(prices2 zip quantities2) map Function.tupled(_ * _) zip discount2 map Function.tupled(_ - _*0.01)


