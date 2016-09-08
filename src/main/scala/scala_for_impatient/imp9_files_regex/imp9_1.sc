import scala.io.Source

//val source1 = Source.fromFile(".\\src\\worksheets\\imp9\\riaTestSetupInstruction.txt")
val source1 = Source.fromFile("D:\\my_doc\\Dropbox\\Work\\Scala\\scala-examples\\src\\scala_for_impatient\\imp9_files_regex\\riaTestSetupInstruction.txt")

val lines = source1.getLines.toArray
for (i <- lines.length - 1 to 0 by -1) {
  println(lines(i))
}
source1.close()


val source2 = Source.fromFile("D:\\my_doc\\Dropbox\\Work\\Scala\\scala-examples\\src\\scala_for_impatient\\imp9_files_regex\\riaTestSetupInstruction.txt")
var lines2 = source2.getLines.toArray.reverse
lines2.foreach(println(_))
source2.close()