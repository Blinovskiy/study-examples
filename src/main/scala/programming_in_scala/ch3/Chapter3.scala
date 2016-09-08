package programming_in_scala.ch3

/**
 * Created by User on 11/24/2015.
 */
object Chapter3 extends App {

  /*
  // step 7 - arrays
  val greetStrings: Array[String] = new Array[String](3)
  greetStrings(0) = "first string"
  greetStrings(1) = "2sec"
  greetStrings(2) = "greet3"


  for(i <- 0 to 2){
    println(greetStrings(i))
  }
  println()
  greetStrings.update(0,"1str")
  // same as top
  for (i <- 0. to(2))
    println(greetStrings.apply(i))


  println((1).+(2));

  println()
  val numNames = Array("zero", "one", "two")
  val numNames2 = Array.apply("zero", "one", "two")

  numNames.foreach(element => {
    print(element + " ")
    if(numNames.length-1 == numNames.indexOf(element)){
      println()
    }

  })
  numNames2.foreach(element => print(element))
  println()

  // step 8 - List

  val oneTwo = List(1, 2)
  val threeFour = List(3, 4)
  val oneTwoThreeFour = oneTwo ::: threeFour
  println(oneTwo +" and "+ threeFour +" were not mutated.")
  println("Thus, "+ oneTwoThreeFour +" is a new list.")

  val oneTwoThree = 1 :: 2 :: 3 :: Nil
  println(oneTwoThree)


  // step 9 - Use tuples
  val pair = (99, "Luftballons")
  println(pair._1)
  println(pair._2)
  println(pair.getClass)


  // Step 10. Use sets and maps

  var jetSet = Set("Boeing", "Airbus")
  jetSet += "Lear"
  jetSet += "Woah"
  jetSet.foreach(elem => println(elem))
  println(jetSet.contains("Cessna"))
  println()

  // mutable set
  import scala.collection.mutable.Set
  val movieSet = Set("Hitch", "Poltergeist")
  movieSet += "Shrek"
  println(movieSet)

  // immutable hashset
  import scala.collection.immutable.HashSet
  val hashSet = HashSet("Tomatoes", "Chilies")
  println(hashSet + "Coriander")

  // immutable map
  val romanNumeral = Map(
    1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
  )
  println(romanNumeral(4))

  // mutable map
  import scala.collection.mutable.Map
  val treasureMap = Map[Int, String] ()
  treasureMap += (1 -> "Go to island.")
  treasureMap += (2 -> "Find big X on ground.")
  treasureMap += (3 -> "Dig.")
  treasureMap.foreach(elem => println(elem))


  // step 11. Learn to recognize the functional style

  def formatArgs(args: Array[String] ) = args.mkString("\n")
  val numNames = Array("zero", "one", "two")
  println(formatArgs(numNames))

  // assert
  val res = formatArgs(Array("zero", "one", "two"))
  assert(res == "zero\none\ntwo")
*/

  // Step 12. Read lines from a file

  import scala.io.Source
  def widthOfLength(s: String) = s.length.toString.length

  if (args.length > 0) {
    val lines = Source.fromFile(args(0)).getLines().toList
    val longestLine = lines.reduceLeft(
      (a, b) => if (a.length > b.length) a else b
    )

    val maxWidth = widthOfLength(longestLine)
    for (line <- lines) {
      val numSpaces = maxWidth - widthOfLength(line)
      val padding = " " * numSpaces
      println(padding + line.length +" | "+ line)
    }
  }
  else
    Console.err.println("Please enter filename")

}
