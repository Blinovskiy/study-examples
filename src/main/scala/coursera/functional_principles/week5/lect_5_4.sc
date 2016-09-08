// Lecture 5.4 - Higher-Order List Functions
def scaleList(xs: List[Double], factor: Double): List[Double] = xs match {
  case Nil => xs
  case y :: ys => y * factor :: scaleList(ys, factor)
}


//abstract class List[T] {
//  def map[U](f: T => U): List[U] = this match {
//  case Nil => this
//  case x:: xs => f(x) :: xs.map(f)
//}



def squareList(xs: List[Int]): List[Int] =
  xs match {
    case Nil => xs
    case y :: ys => y*y :: squareList(ys)
  }

def squareList1(xs: List[Int]): List[Int] =
  xs map (f=> f*f)


val nums = List(4,9,2,3,1,23,15,21,1,8)
squareList(nums)
squareList1(nums)

