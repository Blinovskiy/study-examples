trait RectangleLike {
  def translate(dx: Int, dy: Int): Unit = {
    
  }

  def grow(h: Int, v: Int): Unit = {

  }
}


val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
egg.x
egg.y
egg.width
egg.height

egg.translate(10, -10)
egg.x
egg.y
egg.width
egg.height

egg.grow(10, 20)
egg.x
egg.y
egg.width
egg.height
