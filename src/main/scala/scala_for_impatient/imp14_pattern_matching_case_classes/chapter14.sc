abstract class Item
case class Article(description: String, price: Double) extends Item
case class Bundle(description: String, discount: Double, items: Item*) extends Item

def price(it: Item): Double = it match {
  case Article(_, p) => p
  case Bundle(_, disc, its @ _*) => its.map(price _).sum -disc
}

val item = Bundle("Father's day special", 20.0,
  Article("Scala for Impatient", 39.95),
  Bundle("Anchor Distillery Sampler", 10.0),
  Article("Old Potrero Straight Rye Whiskey", 79.95),
  Article("Junipero Gin", 32.95))

print("%-5.3f ".format(price(item)))