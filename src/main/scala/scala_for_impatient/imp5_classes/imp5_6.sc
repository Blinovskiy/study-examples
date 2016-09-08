class Person(private var privateAge:Int){
  privateAge = if(privateAge>0) privateAge else 0

  def age = privateAge
  def age_=(newValue:Int): Unit ={
    if (newValue > privateAge) privateAge = newValue // cant make younger
  }
}

val p1 = new Person(21)
p1.age
p1.age_=(22)
p1.age
val p2 = new Person(-10)
p2.age