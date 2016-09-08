import scala.io.Source

val source = Source.fromFile("D:\\my_doc\\Dropbox\\Work\\Scala\\scala-examples\\src\\scala_for_impatient\\imp9_files_regex\\riaTestSetupInstruction1.txt")

val doublePattern = """[\n\s]*[0-9]+[.,]+[0-9]+\s+""".r
val lines = source.mkString

for (matchValue <- doublePattern.findAllIn(lines)){
  println(matchValue.trim)
}

source.close