val prices = scala.collection.mutable.Map("Shoes" -> 70.20, "Sweater" -> 30.75)

prices("Shoes") = 69.50
prices

for(k <- prices.keySet) prices(k)-=prices(k)*0.1
prices

