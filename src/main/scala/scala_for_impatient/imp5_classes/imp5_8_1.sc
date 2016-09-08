class Car {
  private var producer = ""
  private var model = ""
  private var year = -1
  private var regNumber:String = ""

  def this(producer: String){
    this()
    this.producer=producer
  }

  def this(producer: String, model: String){
    this(producer)
    this.model=model
  }

  def this(producer: String, model: String, year:Int){
    this(producer,model)
    this.year=year
  }

  def this(producer: String, model: String, year:Int, regNumber:String){
    this(producer,model,year)
    this.regNumber=regNumber
  }

  def getProducer = producer
  def getModel = model
  def getYear = year
  def getRegNumber = regNumber
  def setRegNumber_=(newValue:String): Unit ={
    regNumber = newValue
  }
}

val car = new Car("BMW","M3")
car.getProducer
car.getModel
car.getYear
car.getRegNumber
car.setRegNumber_=("1111")
car.getRegNumber