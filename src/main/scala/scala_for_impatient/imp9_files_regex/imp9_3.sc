import scala.io.Source
val lines = Source.fromFile("D:\\my_doc\\Dropbox\\Work\\Scala\\scala-examples\\src\\scala_for_impatient\\imp9_files_regex\\riaTestSetupInstruction1.txt")
  .mkString.split("\\s+").filter(s=>s.length>12).foreach({var i = 0;p=>println(i+".|  "+p);i+=1})
