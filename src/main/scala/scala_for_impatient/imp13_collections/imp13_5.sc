//
//def mkString(seq: Seq[Int], splitter: String = ""): String ={
//
//  seq.reduceLeft((x, y) => x+splitter+y)
//}
//
//mkString(Seq(1,2,3,4), " - ")

def mkString(charArray:Array[String], splitter: String = ""): String ={

  charArray.reduceLeft((x, y) => x+splitter+y)
}

mkString(Array("a","b","c"), " - ")