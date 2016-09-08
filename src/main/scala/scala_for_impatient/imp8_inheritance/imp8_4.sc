import scala.collection.mutable.ListBuffer

abstract class Item {
  def price: Double

  def description: String

  override def toString: String = price + " - " + description
}

class SimpleItem(override val price: Double, override val description: String) extends Item {

}

class Bundle {
  val bundleList = new ListBuffer[Item]

  def this(item: Item) {
    this()
    bundleList += (item)
  }

  def this(items: ListBuffer[Item]) {
    this()
    bundleList ++= (items)
  }

  def addItem(item: Item): Unit = {
    bundleList += item
  }

  def print: Unit = {
    bundleList.foreach(println(_))
  }

  override def toString = {
    var str = ""
    bundleList.foreach(x => str += x.description + " - " + x.price + " ") //s"Bundle: $bundleList"
    str
  }
}


val s1 = new SimpleItem(12.5, "Something1")
val s2 = new SimpleItem(25.1, "Something2")
val sList = ListBuffer[Item](new SimpleItem(3.4, "List1"), new SimpleItem(43.2, "List2"))

val bundle = new Bundle(sList)
bundle.bundleList.toString
bundle.addItem(s1)
bundle.toString
bundle.addItem(s2)
bundle.bundleList
