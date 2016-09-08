import scala.collection.mutable.ListBuffer

class RichFile(val path: String) {
  def unapply(path: String) = {
    //"C:\Users\User\Dropbox\Work\Scala\scala-examples\src\scala_for_impatient\imp11n\imp11_9.sc"
    val buffArray = path.split('\\')
    //println(buffArray.foreach(x=>print(x+" ")))

    val dir = new ListBuffer[String]
    for (i <- 0 until buffArray.length - 1) {
      dir += buffArray(i) + '\\'
    }
    //    println(dir.foreach(x => print(x)))

    val file = buffArray(buffArray.length - 1).split('.')(0)
    //    println(file)

    val extension = buffArray(buffArray.length - 1).split('.')(1)
    //    println(extension)

    Some((dir.mkString, file, extension))
  }
}

val rf = new RichFile("C:\\Users\\User\\Dropbox\\Work\\Scala\\scala-examples\\src\\scala_for_impatient\\imp11n\\imp11_9.sc")
rf.unapply(rf.path)