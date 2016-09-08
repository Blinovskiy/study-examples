object Conversions{
  def inchesToCentimeters(inch:Double)={
    inch*2.54
  }

  def gallonsToLiters(gallon:Double)={
    gallon*3.78541
  }

  def milesToKilometers(mile:Double)={
    mile*1.60934
  }
}

Conversions.inchesToCentimeters(12)
Conversions.gallonsToLiters(10)
Conversions.milesToKilometers(5)