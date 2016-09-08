import scala.io.Source

val source = Source.fromFile("D:\\my_doc\\Dropbox\\Work\\Scala\\scala-examples\\src\\scala_for_impatient\\imp9_files_regex\\9_6.txt")

val strInQuotes = """[\,\\]*[",'].+[\,\\]*[",']""".r
val lines = source.mkString

for (matchValue <- strInQuotes.findAllIn(lines)){
  println(matchValue)
}

source.close