import java.io.File

def subdirs(dir: File): Iterator[File] = {
  val children = dir.listFiles.filter(_.isDirectory)
  children.toIterator ++ children.toIterator.flatMap(subdirs _ )
}

val dir = new File("D:\\my_doc\\Dropbox\\Work\\Scala\\scala-examples")
for (d <- subdirs(dir)){
  for(f <- d.listFiles) {
    if(f.getName.endsWith(".class"))
      println(f.getName)
  }
}