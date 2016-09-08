class Pair[T, S](f:T,s:S) {
  def swap:Pair[S, T] = {
    new Pair(s,f)
  }
  override def toString: String = f.toString+" - "+s.toString
}

val p = new Pair(42,"String")
p.swap