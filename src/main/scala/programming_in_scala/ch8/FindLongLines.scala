package programming_in_scala.ch8

/**
 * Created by User on 12/16/2015.
 */
object FindLongLines {
  def main(args: Array[String] ) {
    val width = args(0).toInt
    for (arg <- args.drop(1))
      LongLines.processFile(arg, width)
  }
}
