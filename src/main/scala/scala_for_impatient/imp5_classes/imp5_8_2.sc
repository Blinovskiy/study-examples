class Car(val producer: String, val model: String, val year: Int, var regNumber: String) {

  def this(){
    this("","",-1,"")
  }

  def this(producer: String){
    this(producer,"",-1,"")
  }

  def this(producer: String, model: String){
    this(producer,model,-1,"")
  }

  def this(producer: String, model: String, year:Int){
    this(producer,model,year,"")
  }
}

val car = new Car("BMW","M3")
car.producer
car.model
car.year
car.regNumber