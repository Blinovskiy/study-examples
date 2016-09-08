class Point(val x: Double, val y: Double) {
  override def toString: String = x+ ", "+y
}

class LabeledPoint(label: String, x: Double, y: Double) extends Point(x,y){
  override def toString: String = label+": "+x+ ", "+y
}

new LabeledPoint("Black Thursday", 1929, 230.07)