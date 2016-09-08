class Time(val hrs:Int, val min:Int) {

  def before(other:Time): Boolean ={
    if(this.hrs<other.hrs) true
    else if(this.hrs>other.hrs) false
    else if(this.min<other.min) true
    else if(this.min>other.min) false
    else false
  }

}

val t1 = new Time(10,10)
val t2 = new Time(10,50)
t1.before(t2)