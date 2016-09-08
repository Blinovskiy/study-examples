package scala_for_impatient.imp12_functions

/**
  * Created by User on 4/19/2016.
  */
object RunInThread extends App {
  def runInThread(block: () => Unit): Unit = {
    new Thread {
      override def run() {
        block()
      }
    }.start()
  }

  def until(condition: => Boolean)(block: => Unit): Unit = {
    if (!condition) {
      block
      until(condition)(block)
    }
  }

  def indexOf(str: String, ch: Char): Int = {
    var i = 0
    until (i == str.length){
      if (str(i) == ch) return i
        i+=1
    }
    return -1
  }

  val s = "12345"
  println(indexOf(s,'3'))

//  var x = 10
//  until(x == 0) {
//    x -= 1
//    println(x)
//  }

  //  runInThread { () => println("Hi"); Thread.sleep(3000); println("Bye") }
}
