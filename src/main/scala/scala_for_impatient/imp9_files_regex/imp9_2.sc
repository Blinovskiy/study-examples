import java.io.PrintWriter

import scala.io.Source

val source = Source.fromFile("D:\\my_doc\\Dropbox\\Work\\Scala\\scala-examples\\src\\scala_for_impatient\\imp9_files_regex\\riaTestSetupInstruction1.txt")
val lines = source.getLines.mkString("\n").replace('0','1')
print(lines)

//val iter = source.buffered
//while(iter.hasNext){
//  if(iter.next.equals('\t'))
//    println("!!!!!!!!!")
//}

val out = new PrintWriter("C:\\riatest.txt")
out.print(lines)
source.close()
out.close()