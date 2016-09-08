import java.io.FileNotFoundException
import scala.annotation.varargs
import scala.io.Source

@varargs
def readFromFile(path: String*): String = {
  try {
    val file = Source.fromFile(path.head)
    file.mkString
  }
  catch {
    case e: FileNotFoundException => "Exception: File not found"
  }
}

readFromFile("C:\\Users\\User\\Desktop\\vpn.txt")