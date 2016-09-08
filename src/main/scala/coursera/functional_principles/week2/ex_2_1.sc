/**
  * We represent a set by its characteristic function, i.e.
  * its `contains` predicate.
  */
type Set = Int => Boolean

/**
  * Indicates whether a set contains a given element.
  */
def contains(s: Set, elem: Int): Boolean = s(elem)

/**
  * Returns the set of the one given element.
  */
def singletonSet(elem: Int): Set = (x: Int) => x == elem


/**
  * Returns the union of the two given sets,
  * the sets of all elements that are in either `s` or `t`.
  */
def union(s: Set, t: Set): Set = (x: Int) => s(x) || t(x)

/**
  * Returns the intersection of the two given sets,
  * the set of all elements that are both in `s` and `t`.
  */
def intersect(s: Set, t: Set): Set = (x: Int) => s(x) && t(x)

/**
  * Returns the difference of the two given sets,
  * the set of all elements of `s` that are not in `t`.
  */
def diff(s: Set, t: Set): Set = (x: Int) => !union(s, t)(x) //!s(x) || t(x)

/**
  * Returns the subset of `s` for which `p` holds.
  */
def filter(s: Set, p: Int => Boolean): Set = (x: Int) => intersect(s, p)(x) //s(x) && p(x)


/**
  * The bounds for `forall` and `exists` are +/- 1000.
  */
val bound = 50

/**
  * Returns whether all bounded integers within `s` satisfy `p`.
  */
def forall(s: Set, p: Int => Boolean): Boolean = {
  def iter(a: Int): Boolean = {
    if (a == bound) true
    else if (contains(s, a) && !p(a)) false
    else iter(a + 1)
  }
  iter(-bound)
}

//¬[∀x ∈ A, P(x)] ⇔ ∃x ∈ A, ¬P(x)
//
//where
//
//¬ means "not"; ∀ means forall; ∃ means exists; P(x) corresponds to the predicate.
/**
  * Returns whether there exists a bounded integer within `s`
  * that satisfies `p`.
  */
def exists(s: Set, p: Int => Boolean): Boolean = {
  def iter(a: Int): Boolean = {
    if (a == bound) false
    else if (contains(s, a) && p(a)) true
    else iter(a + 1)
  }
  iter(-bound)
}

/**
  * Returns a set transformed by applying `f` to each element of `s`.
  */
def map(s: Set, f: Int => Int): Set =
//  (x:Int) => {print(f(x)+"^ ");s(f(x))}
  (x: Int) => {
    //print(f(x) + "^ ")
    exists(s, (a:Int) => f(a) == x )
  }

//{ elem:Int => exists(s, {elem2:Int => f(elem2) == elem})

/**
  * Displays the contents of a set
  */
def toSString(s: Set): String = {
  val xs = for (i <- -bound to bound if contains(s, i)) yield i
  xs.mkString("{", ",", "}")
}

/**
  * Prints the contents of a set on the console.
  */
def printSet(s: Set) {
  println(toSString(s))
}


val set = singletonSet(1)
contains(set, 1)
contains(set, 2)
printSet(set)

println("union")
val set2 = union(singletonSet(7), singletonSet(3))
printSet(set2)
println("intersect")
val set3 = intersect(singletonSet(7), singletonSet(3))
printSet(set3)
println("diff")
val set4 = diff(singletonSet(7), singletonSet(3))
printSet(set4)

println("filter")
val set5 = filter(set4, p => p > 10 && p <= 40)
printSet(set5)

println("forall")
forall(set5, a => a > 10)
forall(set5, a => a > 11)

println("exists")
exists(set5, a => a == 10)
exists(set5, a => a == 11)


println("set5")
printSet(set5)
println("map")
val set6 = map(set5, x => x - 10)
printSet(set6)