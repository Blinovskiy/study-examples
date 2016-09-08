sealed abstract class BinaryTree
case class Leaf(value: Int) extends BinaryTree
case class Node(childs: BinaryTree*) extends BinaryTree

val tree = Node(Node(Leaf(1),Leaf(2),Leaf(3),Leaf(4)),Node(Leaf(5),Leaf(6),Leaf(7)))

def sumTree(btree: BinaryTree):Int = {
  btree match {
    case Node(childs @ _*) => childs.map(sumTree _).sum
    case Leaf(v) => v
  }
}

sumTree(tree)
