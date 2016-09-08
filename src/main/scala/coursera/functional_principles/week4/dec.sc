def decode(tree: CodeTree, bits: List[Bit]): List[Char] = {
  //    def split(list: List[Int]): List[List[Int]] = {
  //      if (list.isEmpty)
  //        List()
  //      else {
  //        val ls = list.splitAt(list.indexOf(1) + 1)
  //        ls._1 :: split(ls._2)
  //      }
  //    }
  //  println()
  //  print(split(bits))
  //  println()
  //
  //  split(bits).flatMap(b => dec(tree, b))
  //  //split(bits).map(d=>dec(tree,d)).flatten
  //
  //    def dec(tree: CodeTree, bits: List[Bit]): List[Char] = tree match {
  //      case Fork(l, r, c, w) => if (bits.head == 0) dec(l, bits.tail) else dec(r, bits.tail)
  //      case Leaf(c, w) => List(c) //if(bits.isEmpty) List(c) else List(c) ++ decode(tree,bits)
  //    }

  //    tree match {
  //      case Fork(l, r, c, w) => if(bits.isEmpty) List('-') else if (bits.head == 0) decode(l, bits.tail) else decode(r, bits.tail)
  //      case Leaf(c, w) => if(bits.isEmpty) List(c) else List(c) ::: decode(tree,bits)
  //    }
  val tr = tree

  def innerDecode(tree: CodeTree, bits: List[Bit]): List[Char] = tree match {
    case Fork(l, r, c, w) =>  if(bits.isEmpty) List('*') else if (bits.head == 0) innerDecode(l, bits.tail) else innerDecode(r, bits.tail)
    case Leaf(c, w) => if(bits.isEmpty) List(c) else List(c) ++ decode(tr,bits)
  }
  innerDecode(tree,bits)

}