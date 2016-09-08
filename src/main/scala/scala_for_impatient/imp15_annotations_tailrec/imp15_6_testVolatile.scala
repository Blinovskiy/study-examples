package scala_for_impatient.imp15_annotations_tailrec

/**
  * Created by User on 5/11/2016.
  */
object imp15_6_testVolatile extends App {
  @volatile var flag = false

  new Thread(new Runnable {
    def run() {
      Thread.sleep(1000)
      flag = true
      println("1 thread: "+flag)
    }
  }).start()

  new Thread(new Runnable {
    def run() {
      while (!flag) {
        println(flag)
        Thread.sleep(100)
      }
      println("2 thread: "+flag)
    }
  }).start()

}
