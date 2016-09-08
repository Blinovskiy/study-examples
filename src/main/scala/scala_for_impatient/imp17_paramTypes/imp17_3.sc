class Pair[T, S](val f:T,val s:S) {
  def swap(pair:Pair[T, S]):Pair[S, T] = {
    new Pair(pair.s,pair.f)
  }
  override def toString: String = f.toString+" - "+s.toString
}

val p = new Pair(42,"String")
p.swap(p)




object Pair {
  def swap[T, S](pair:Pair[T, S]):Pair[S, T] = {
    new Pair(pair.s,pair.f)
  }
}


val p1 = new Pair(42,"String")
Pair.swap(p1)