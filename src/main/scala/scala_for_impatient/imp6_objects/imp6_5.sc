object Reverse extends App {
  args.foreach(x=> print(x + " "))
  println()

  if (args.length > 0)
    for (i <- args.length-1 to 0 by -1) {
      print(args(i))
      print(" ")
    }
}