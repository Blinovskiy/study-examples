class Point(val x: Int, val y: Int) {
  def distance = Math.abs(x - y)
}

object Point {
  def apply(x: Int, y: Int) ={
    new Point(x, y)
  }
}

val p = Point(7,3)
p.x
p.y
p.distance