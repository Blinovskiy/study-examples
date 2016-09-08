type Word = String
type Sentence = List[Word]
type Occurrences = List[(Char, Int)]

def wordOccurrences(w: Word): Occurrences = w.groupBy(ch => ch.toLower).map(c => (c._1, c._2.length)).toList.sortBy(_._1)


def combinations(occurrences: Occurrences): List[Occurrences] =
  occurrences match {
    case List() => List(Nil)
    case (c, n) :: others =>
      val tails = combinations(others)
      tails ::: (for {
        j <- tails
        i <- 1 to n
      } yield (c, i) :: j)
}

val occ = wordOccurrences("aabbcc")
//occ.toSet.subsets.foreach(println(_))
combinations(occ).foreach(println(_))


// Substract method
//Step1: In the first function, I take out the elements in x that are also present in y and get a
//  new x which is a filtered List of common elements
//
//Step2: I pass the filtered List to my second function and use pattern matching and in my case a :: as,
//I call another function by passing a and y and the accumulator
//
//Step3: The third function that I call from step 2 above will actually iterate through y and perform
//the check against a.