val names = Array("Tom","Fred","Harry")
val map = Map("Tom" -> 3,"Dick"-> 4,"Harry" -> 5)


def getExistsValuesFromMap(names:Array[String], map:Map[String,Int]): Array[Int] ={
  names.map(p => map.filterKeys(_.equals(p)).values).flatMap(f => f)
}
getExistsValuesFromMap(names,map)






