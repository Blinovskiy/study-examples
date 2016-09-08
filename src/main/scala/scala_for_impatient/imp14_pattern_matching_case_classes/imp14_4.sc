abstract class Item
case class Multiple(count: Int, items: Item*) extends Item
case class Article(description: String, price: Double) extends Item
case class Bundle(description: String, discount: Double, items: Item*) extends Item

def price(it: Item): Double = it match {
  case Multiple(c, its @ _*) => its.map(price _).sum * c
  case Article(_, p) => p
  case Bundle(_, disc, its @ _*) => its.map(price _).sum - disc
}

val item = Multiple(4,Bundle("Father's day special", 20.0,
  Article("Scala for Impatient", 39.95),
  Bundle("Anchor Distillery Sampler", 10.0),
  Article("Old Potrero Straight Rye Whiskey", 79.95),
  Article("Junipero Gin", 32.95)))

price(item).formatted("%-5.2f")
