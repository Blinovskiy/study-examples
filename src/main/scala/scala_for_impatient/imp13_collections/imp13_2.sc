
def indexMapping(str: String): Map[Char,IndexedSeq[Int]] = {
  str.zipWithIndex.groupBy(_._1).mapValues(x => x.map(_._2))
}
def indexMappingSet(str: String): Map[Char, Set[Int]] = {
  str.zipWithIndex.groupBy(_._1).mapValues(x => x.map(_._2).toSet[Int])
}
indexMapping("Mississippi")
indexMappingSet("Mississippi")
