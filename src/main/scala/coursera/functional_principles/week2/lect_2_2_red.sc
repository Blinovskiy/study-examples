//def prod(f: Int => Int)(a: Int, b: Int): Int = {
//  def loop(a: Int, acc: Int): Int = {
//    if (a > b) acc
//    else loop(a + 1, acc * f(a))
//  }
//  loop(a, 1)
//}
//
//prod(x => x)(1, 10) // 3628800
//
//def fact(n: Int): Int = {
//  if (n == 0) 1
//  else n * fact(n - 1)
//}
//fact(3)

//def fun(f: Int => Int)(comp: (Int, Int) => Int)(a: Int, b: Int, startValue: Int): Int = {
//  if (a > b) startValue
//  else comp(f(a), fun(f)(comp)(a + 1, b, startValue))
//}
//fun(x => x)((x, y) => x + y)(1, 10, 0)