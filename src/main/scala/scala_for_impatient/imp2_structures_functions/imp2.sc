val x = 4
val x1 = if (x > 0) 1 else ()

val x2=
if (x > 4)
  1
else
  ()

printf("Hi, %s! You are %d years old.", "Sergey", 22)

for (i <- 1 to 3; j <- 1 to 3) print((10 * i + j) + " ")
for (i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * i + j) + " ")
for (i <- 1 to 3; from = 4 - i; j <- from to 3) print((10 * i + j) + " ")

val col = for (i <- 1 to 10) yield i
col.foreach(println)
col.map(_.toString)

// 1
def signum(value:Int) = {
  if (value > 0) 1
  else if (value == 0) 0
  else -1
}
signum(22)
signum(0)
signum(-100)
// 3
//var a:Unit = null
//var b:Int = 2
//a = b = 1
//println(a)

//5
def countdown(n : Int)  {
  for (i <- n to 0 by -1) {
    println(i)
  }
}
countdown(10)

//6
var keyCodeMul = 1L;
for(c <- "Hello"){
  keyCodeMul*=c.toInt
}
println(keyCodeMul)

val str = "Hello"
var mul = 1L;
str.foreach(x=>{println(x.toInt); mul*=x.toInt})
println(mul)



