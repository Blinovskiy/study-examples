import scala.collection.mutable


def deleteNulls(linkedList: scala.collection.mutable.LinkedList[Int]): mutable.LinkedList[Int] = {
  var cur = linkedList
  while (cur != Nil) {
    if (cur.next.elem == 0) cur.next = cur.next.next
    println(cur)
    cur = cur.next
  }
  linkedList
}

val list = mutable.LinkedList(0, 1, 2, -5, 0, 2, 0)
deleteNulls(list)

