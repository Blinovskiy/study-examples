class Pair[T](f:T,s:T) {
  def swap:Pair[T] = {
    new Pair(s,f)
  }
  override def toString: String = f.toString+" - "+s.toString
}

val p = new Pair(42,23)
p.swap