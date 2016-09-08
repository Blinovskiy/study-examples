package programming_in_scala.ch6

/**
 * Created by User on 12/9/2015.
 */
object Chapter6 extends App{


  val r1 = new Rational(4,5)
  val r2 = new Rational(3,5)

  var x:AnyRef = new Rational(1,1)
  println(x.asInstanceOf[Rational] - r1)


  println(r1 + r2)
  println(r1 * r2)
  println(2 * r1)

}
