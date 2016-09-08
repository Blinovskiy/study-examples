package scala_for_impatient.imp6_objects

/**
  * Created by User on 3/28/2016.
  */
object Reverse extends App {
  args.foreach(x=> print(x + " "))
  println()

  if (args.length > 0)
    for (i <- args.length-1 to 0 by -1) {
      print(args(i))
      print(" ")
    }
}
