val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")

capitalOfCountry("US")
capitalOfCountry get "Andorra"
capitalOfCountry get "US"

def showCapital(country: String) = capitalOfCountry.get(country) match {
  case Some(capital) => capital
  case None => "missing data"
}

showCapital("US")
showCapital("Andora")

val fruits = List("apple","pear", "orange", "pineapple", "banana")
fruits.sortWith(_.length < _.length)    // Custom ordering
fruits.sorted   // Lexicographic ordering

fruits.groupBy(_.head)


// polynom
class Poly(val terms0: Map[Int, Double]) {
  val terms = terms0 withDefaultValue 0.0
  def + (other: Poly) = new Poly(terms ++ (other.terms map adjust))
  def adjust(term: (Int, Double)): (Int, Double) = {
    val (exp, coeff) = term
    exp -> (coeff + terms(exp))
//    terms get exp match {
//      case Some(coeff1) => exp -> (coeff + coeff1)
//      case None => exp -> coeff
//    }
  }

  override def toString:String =
    (for((exp, coeff) <- terms.toList.sorted.reverse) yield coeff+"x^"+exp) mkString "+"
}

val p1 = new Poly(Map(1 -> 2.0, 3 -> 4.0, 5 -> 6.2))
val p2 = new Poly(Map(0 -> 3.0, 3 -> 7.0))
p1 + p2
p1.terms(7)
// polynom



val cap1 = capitalOfCountry withDefaultValue("<unknown>")
cap1("Andorra")