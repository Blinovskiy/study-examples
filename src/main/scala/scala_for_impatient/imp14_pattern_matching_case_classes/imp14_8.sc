sealed abstract class BinaryTree
case class Leaf(value: Int) extends BinaryTree
case class Node(sign: Char, childs: BinaryTree*) extends BinaryTree

//val tree = Node('+',Node('*',Leaf(3),Leaf(8)),Leaf(1),Node('/',Leaf(5),Leaf(7)))
val tree = Node('+',Node('*',Leaf(3),Leaf(8)),Leaf(2),Node('-',Leaf(5)))

def evalTree(btree: BinaryTree):Double = {
  btree match {
    case Node(sign, childs @ _*) => sign match {
      case '+' => childs.map(evalTree _).sum
      case '-' => childs.map(evalTree _).foldLeft(0.0)(_ - _)
      case '*' => childs.map(evalTree _).product
      case '/' => childs.map(evalTree _).reduceLeft(_ / _)
      //case _ => 0
    }
    case Leaf(v) => v
  }
}

evalTree(tree)
