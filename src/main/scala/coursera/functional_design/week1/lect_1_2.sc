//The syntax of for is closely related to the higher-order functions
//  map, flatMap and filter.
//  First of all, these functions can all be defined in terms of for:
def mapFun[T, U](xs: List[T], f: T => U): List[U] =
  for (x <- xs) yield f(x)
def flatMap[T, U](xs: List[T], f: T => Iterable[U]): List[U] =
  for (x <- xs; y <- f(x)) yield y
def filter[T](xs: List[T], p: T => Boolean): List[T] =
  for (x <- xs if p(x)) yield x


val e1 = List()
val e2,e3,f,s,n = null

//1. A simple for-expression
for (x <- e1) yield e2
//is translated to
e1.map(x => e2)



//2. A for-expression?
for (x <- e1 if f; s) yield e2
//where f is a filter and s is a (potentially empty) sequence of
//generators and filters, is translated to
for (x <- e1.withFilter(x => f); s) yield e2
//(and the translation continues with the new expression)
//You can think of withFilter as a variant of filter that does not
//produce an intermediate list, but instead filters the following map or
//flatMap function application.



//3. A for-expression
for (x <- e1; y <- e2; s) yield e3
//where s is a (potentially empty) sequence of generators and filters,
//is translated into
e1.flatMap(x => for (y <- e2; s) yield e3)
//(and the translation continues with the new expression)


//Take the for-expression that computed pairs whose sum is prime:
for {
  i <- 1 until n
  j <- 1 until i
  if isPrime(i + j)
} yield (i, j)
//Applying the translation scheme to this expression gives:
  (1 until n).flatMap(i =>
  (1 until i).withFilter(j => isPrime(i+j))
    .map(j => (i, j)))
//This is almost exactly the expression which we came up with first!