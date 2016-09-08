
val lst = scala.collection.mutable.LinkedList(1, -2, 7, -9, 5, 4)

(lst :\ List[Int](12))(_ :: _)

(List[Int](12) /: lst)(_ :+ _)

lst