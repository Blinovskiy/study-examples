package programming_in_scala.ch7

/**
 * Created by User on 12/9/2015.
 */
object Chapter7 extends App{
  /*
  // 7.2 While loops
  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }b
  }

  var line = ""
  do {
    line = readLine()
    println("Read: "+ line)
  } while (line != "")
  */

  /*
  // 7.3 Filtering
  val filesHere = (new java.io.File(".\\src\\programming_in_scala.ch6")).listFiles
  for (
    file <- filesHere
    if file.isFile
    if file.getName.endsWith(".scala")
  ) println(file)
  */

  /*
  // 7.3 Nested iteration
  val filesHere = (new java.io.File(".\\src\\programming_in_scala.ch6")).listFiles

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList
  def grep(pattern: String) =
    for (
      file <- filesHere
      if file.getName.endsWith(".scala");
      line <- fileLines(file)
      if line.trim.matches(pattern)
    ) println(file +": "+ line.trim)
  grep(".*var.*")
  */

  /*
  // 7.3 Producing a new collection
  val filesHere = (new java.io.File(".\\src\\programming_in_scala.ch6")).listFiles
  def scalaFiles =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
    } yield file

  scalaFiles.foreach(file => println(file))
  */

  /*
  // 7.4 Exception handling with try expressions
  import java.net.URL
  import java.net.MalformedURLException
  def urlFor(path: String) =
    try {
      new URL(path)
    } catch {
      case e: MalformedURLException =>
        new URL("http://www.scala-lang.org")
    }
  println(urlFor("111"))


  def f(): Int = try { return 1 } finally { return 2 }
  def g(): Int = try { 1 } finally { 2 }
  println(f)
  println(g)
  */

  /*
  // 7.5 Match expressions
  def friend(value:String) =
    value match {
      case "salt" => "pepper"
      case "chips" => "salsa"
      case "eggs" => "bacon"
      case _ => "huh?"
    }
  println(friend("salt"))
  */

  /*
  // 7.7 Variable scope
  def printMultiTable() {
    var i = 1
    // only i in scope here
    while (i <= 10) {
      var j = 1
      // both i and j in scope here
      while (j <= 10) {
        val prod = (i * j).toString
        // i, j, and prod in scope here
        var k = prod.length
        // i, j, prod, and k in scope here
        while (k < 4) {
          print(" ")
          k += 1
        }
        print(prod)
        j += 1
      }
      // i and j still in scope; prod and k out of scope
      println()
      i += 1
    }
    // i still in scope; j, prod, and k out of scope
  }
  printMultiTable()
  */

  /*
  // 7.7 val
  val c = 1
  val c = 2 // Does not compile
  println(c)

  val a = 1;
  {
    val a = 2 // Compiles just fine
    println("Inner val: " + a)
  }
  println("Outer val: " + a)

  println()

  def b = 1;
  {
    def b = 2;
    {
      println(b)
    }
  }
  */


  /*
  // 7.8 Refactoring imperative-style code // page 181
  // refactor printMultiTable()

  // Returns a row as a sequence
  def makeRowSeq(row: Int) =
    for (col <- 1 to 10) yield {            //yield writting format
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }
  // Returns a row as a string
  def makeRow(row: Int) = makeRowSeq(row).mkString
  // Returns table as a string with one row per line
  def multiTable() = {
    val tableSeq = // a sequence of row strings
      for (row <- 1 to 10)
        yield makeRow(row)
    tableSeq.mkString("\n")
  }

  println(multiTable())
  */



}


