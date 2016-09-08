def leafSum(list:List[Any]): Int = list map {
  case elem: List[Any] => leafSum(elem)
  case elem: Int => elem
  case _ => 0
} sum

val listAny = List(List(3,8),2,List(5))

leafSum(listAny)
