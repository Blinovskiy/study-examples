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



//val t1 = new NonEmpty(3, new Empty, new Empty)
//val t2 = t1 incl 4
//
//val t3 = t2 incl 7 incl 2 incl 14 incl 9

val t1 = new NonEmpty(7, new NonEmpty(1,new Empty, new Empty), new NonEmpty(9,new Empty, new Empty))
val t2 = new NonEmpty(4, new NonEmpty(3,new Empty, new Empty), new NonEmpty(10,new Empty, new Empty))
//val t2 = new NonEmpty(4, new Empty, new Empty)
val t3 = t1.union(t2)