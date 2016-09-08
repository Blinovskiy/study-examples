object RichFile {
  //def apply(path: String): File = new File(path)
  def unapplySeq(path: String): Option[Seq[String]] = {
    if (path.trim == "") None
    else Some(path.trim.split('\\'))
  }
}



val currentPath = "C:\\Users\\User\\Dropbox\\Work\\Scala\\scala-examples\\src\\scala_for_impatient\\imp11n\\imp11_9.sc"

currentPath match {
  case RichFile(disk) => println(s"disk: $disk")
  case RichFile(disk, filename) => println(s"disk: $disk\nfilename: $filename")
  //case RichFile(disk,dir1,dir2,dir3,dir4,dir5,dir6,dir7,dir8,dir9,filename) => println("3")
  case RichFile(disk,path @ _*) => println(s"disk: $disk\npath: $path")
  case _ => "No matches"
}

val pattern = """(.*):(.*)\\(.*)""".r
currentPath match {
  case pattern(disk,path,filename) => println(s"disk: $disk\npath: $path\nfilename: $filename")
  case RichFile(disk,last @ _*) => println("4");println(disk);println(last);
  case _ => "No matches"
}
