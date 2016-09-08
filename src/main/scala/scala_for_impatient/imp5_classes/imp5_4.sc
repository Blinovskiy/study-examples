class Time(val hrs:Int, val min:Int) {
  val minutes = hrs*60+min

  def before(other:Time): Boolean ={
    if(this.minutes<other.minutes) true
    else false
  }
}

val t1 = new Time(10,10)
val t2 = new Time(10,50)
t1.before(t2)