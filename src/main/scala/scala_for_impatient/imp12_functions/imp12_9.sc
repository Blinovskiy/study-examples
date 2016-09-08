//def corresponds[B](that: Seq[B])(p: (A, B) => Boolean): Boolean = { }

def corresponds1(fun: (String, String) => Boolean, a: Seq[String], b: Seq[String]): Boolean = {
  a.corresponds(b)(fun(_,_))
}

val x1 = Array("1","1","1","2")
val y1 = Array("1","1","1","2")

corresponds1((x1,y1) => {x1.equals(y1)}, x1, y1)