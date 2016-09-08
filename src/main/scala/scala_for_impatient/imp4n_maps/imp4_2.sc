//import java.io.File
//import java.util.Scanner
//import scala.sys.process
//
////val in = new Scanner(new File(".\\src\\worksheets\\imp4\\imp4_1.sc"))
//val in = new Scanner(new File(".\\src\\programming_in_scala.ch3\\Chapter3.scala"))
//
//while (in.hasNext()) process in.next()

val source = scala.io.Source.fromFile(".\\src\\worksheets\\imp4\\imp4_1.sc")
val lines = try source.mkString finally source.close()
lines
