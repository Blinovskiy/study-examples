class Creature {
  val range: Int = 10
  val env = Array[Int](range)
}

class Ant extends Creature {
  override val range = 2
}

val c = new Creature
val a = new Ant
c.env
c.range

a.env
a.range