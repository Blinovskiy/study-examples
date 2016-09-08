class Square(x: Int, y: Int, width: Int, height: Int) extends java.awt.Rectangle(x, y, width, height) {
  def this(width: Int, height: Int) {
    this(0, 0, width, height)
  }

  def this() {
    this(0, 0, 0, 0)
  }
}

new Square()
new Square(10, 15)
new Square(5, 15, 30, 10)