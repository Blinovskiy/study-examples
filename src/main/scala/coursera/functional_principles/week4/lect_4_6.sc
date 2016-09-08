// Pattern matching

trait Expr {
  def eval: Int = this match {
    case Number(n) => n
    case Prod(e1, e2) => e1.eval * e2.eval
    case Sum(e1, e2) => e1.eval + e2.eval
    case Var(s) => throw new Error("Cant evaluate string value")
  }
}
case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr
case class Prod(e1: Expr, e2: Expr) extends Expr
case class Var(s: String) extends Expr

def show(e: Expr): String = e match {
  case Number(n) => n.toString

  case Prod(Sum(a1,a2), Sum(b1,b2)) => "(" + show(Sum(a1,a2)) + ")" + " * " + "(" + show(Sum(b1,b2)) + ")"
  case Prod(Sum(m1,m2), e2) => "(" + show(Sum(m1,m2)) + ")" + " * " + show(e2)
  case Prod(e1, Sum(a1,a2)) => show(e1)  + " * " + "(" + show(Sum(a1,a2)) + ")"
  case Prod(e1, e2) => show(e1)  + " * " + show(e2)

  case Sum(e1, e2) => show(e1) + " + " + show(e2)
  case Var(s) => s
}

show(Sum(Number(3),Number(4)))
show(Number(4))

show(Sum(Prod(Number(2), Var("x")), Var("y")))
show(Prod(Sum(Number(2), Var("x")), Var("y")))

show(Prod(Sum(Number(2), Var("x")), Sum(Var("y"),Number(6))))


