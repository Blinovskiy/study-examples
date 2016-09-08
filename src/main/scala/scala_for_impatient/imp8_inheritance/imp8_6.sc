class Point(val x: Double, val y: Double) {
  override def toString: String = x+ ", "+y
}

abstract class Shape {
  def centerPoint(): Point
}

class Rectangle(startPoint: Point, width: Double, height: Double) extends Shape{
  override def centerPoint(): Point = new Point((startPoint.x+width)/2,(startPoint.y+height)/2)

  override def toString: String = s"x=$startPoint, width=$width, height=$height"
}

class Circle(override val centerPoint: Point, radius: Double) extends Shape {
  override def toString: String = s"x=$centerPoint, radius=$radius"
}

val rect = new Rectangle(new Point(10.5, 15),50.5,20)
rect.centerPoint()
val circ = new Circle(new Point(0,0),30)
circ.centerPoint
