trait List[+T] {
  def head: T
  def tail: List[T]
  def isEmpty: Boolean
  def prepend [U >: T] (elem: U): List[U] = new Cons(elem, this)
}
class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}
object Nil extends List[Nothing] {
  def head: Nothing = throw new java.util.NoSuchElementException("Nil.head")
  def tail: Nothing = throw new java.util.NoSuchElementException("Nil.Tail")
  def isEmpty: Boolean = true
}




abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(X: Int): Boolean
  def union(other: IntSet): IntSet
}

class Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
  def union(other: IntSet): IntSet = other
  override def toString = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem,left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this

  def union(other: IntSet): IntSet = {
    println()
    println(s"$this - $other")
    println(s"(($left union $right) union $other) incl $elem")
    ((left union right) union other) incl elem
  }

  override def toString = "{" + left + elem + right + "}"
}

object test {
  val x: List[String] = Nil
  def f(xs: List[NonEmpty], x: Empty) = xs prepend x
}

