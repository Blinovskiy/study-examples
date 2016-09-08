
def sum1(list: List[Option[Int]]) = {
  var sum = 0
  list.foreach(x => sum += x.getOrElse(0))
  sum
}

def sum2(list: List[Option[Int]]) = {
  var sum = 0
  for (elem <- list) sum += elem.getOrElse(0)
  sum
}

def sum3(list: List[Option[Int]]) = {
  list.collect { case a: Option[Int] if a.isDefined => a.get case b: Option[Int] => 0 } sum
}


val list = List(Some(1), Some(2), None, Some(5))
sum1(list)
sum2(list)
sum3(list)
