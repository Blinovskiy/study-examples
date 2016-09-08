abstract class UnitConversion{
  def convert(value:Double):Double
}

object InchesToCentimeters extends UnitConversion{
  override def convert(value:Double)={
    value*2.54
  }
}

object GallonsToLiters extends UnitConversion{
  override def convert(value:Double)={
    value*3.78541
  }
}

object MilesToKilometers extends UnitConversion{
  override def convert(value:Double)={
    value*1.60934
  }
}

val a:Int = 5
InchesToCentimeters.convert(a)
GallonsToLiters.convert(2)
MilesToKilometers.convert(2.0)