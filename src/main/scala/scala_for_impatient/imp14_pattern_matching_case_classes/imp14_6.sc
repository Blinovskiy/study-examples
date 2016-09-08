sealed abstract class BinaryTree
case class Leaf(value: Int) extends BinaryTree
case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

val tree = Node(Node(Leaf(1),Leaf(2)),Node(Leaf(3),Leaf(4)))

def sumTree(btree: BinaryTree):Int = {
  btree match {
    case Node(left, right) => sumTree(left) + sumTree(right)
    case Leaf(v) => v
  }
}

sumTree(tree)
