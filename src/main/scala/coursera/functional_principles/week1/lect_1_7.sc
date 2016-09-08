

def factorial(n: Int): Int = {
  @tailrec
  def loop(acc: Int, n: Int): Int = {
    println(acc)
    if (n == 0) acc
    else loop(acc * n, n - 1)
  }
  loop(1, n)
}

factorial(5)