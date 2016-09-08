class Employee1(val name: String, var salary: Double){
  def this() { this("John Q. Public", 0.0)}
}

class Employee2(){
  private var employeeName: String = "John Q. Public"
  var salary: Double = 0.0

  def this(name: String, salary: Double) {
    this()
    this.employeeName = name
    this.salary=salary
  }

  def name = employeeName
}