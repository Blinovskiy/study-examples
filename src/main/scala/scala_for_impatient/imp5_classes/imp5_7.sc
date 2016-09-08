class Person(val fullName:String, private var privateAge:Int){
  privateAge = if(privateAge>0) privateAge else 0

  def age = privateAge
  def age_=(newValue:Int): Unit ={
    if (newValue > privateAge) privateAge = newValue // cant make younger
  }

  def firstname = fullName.split(" ")(0)
  def lastname = fullName.split(" ")(1)
}

val p1 = new Person("Fred Smith",21)
p1.age
p1.age_=(22)
p1.age
p1.age=23
p1.age

p1.fullName
p1.firstname
p1.lastname
