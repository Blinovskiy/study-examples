import java.awt.Color

object CubeSides extends Enumeration {
  val nlu = new Color(0,0,255)
  val nru = new Color(255,255,255)
  val nld = new Color(0,0,255)
  val nrd = new Color(0,255,255)

  val flu = new Color(255,0,0)
  val fru = new Color(255,255,0)
  val fld = new Color(0,0,0)
  val frd = new Color(0,255,0)
}

CubeSides.nlu
CubeSides.frd