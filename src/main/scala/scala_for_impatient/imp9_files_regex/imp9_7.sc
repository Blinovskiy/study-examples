import scala.io.Source

val source = Source.fromFile("D:\\my_doc\\Dropbox\\Work\\Scala\\scala-examples\\src\\scala_for_impatient\\imp9_files_regex\\riaTestSetupInstruction1.txt")

val notDoublePattern = """[\s,\t,\n]+[0-9]+[.][0-9]+[.]*[\s,\t,\n]+""".r
val lines = source.mkString

for (matchValue <- notDoublePattern.replaceAllIn(lines,"\n")){
  print(matchValue)
}
//print(lines.replaceAll(notDoublePattern.regex,""))

source.close