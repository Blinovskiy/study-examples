val f: String => String = { case "ping" => "pong"}

f("ping")
//f("abc")


val fp: PartialFunction[String, String] = { case "ping" => "pong"}

fp.isDefinedAt("ping")
fp.isDefinedAt("pong")



val e1 = List(1, 2, 3, 4, 5)
val s = "123"
//for (x <- e1 if x > 3; s) yield x + 1

val N = 10

val r1 = for {
  x <- 2 to N
  y <- 2 to x
  if (x % y == 0)
} yield (x, y)

val r2 = (2 to N) flatMap (x =>
  (2 to x) withFilter (y =>
    x % y == 0) map (y => (x, y)))

r1==r2
