import scala.collection.mutable.ListBuffer
import scala.io.Source

val source1 = Source.fromURL("http://ww35.hortsmann.com/", "UTF-8")

val urlPattern = """<img src=(.+)>""".r
val lines = source1.mkString

var srcList = new ListBuffer[String]
for (matchValue <- urlPattern.findAllIn(lines)){
  println(matchValue)
  val pattern = """(.*)src="(.*)(".*)""".r
  val pattern(begin,url,end) = matchValue
  srcList += url
}

srcList.toString


