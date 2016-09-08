package programming_in_scala.ch4

/**
 * Created by User on 12/9/2015.
 */

// Section 4.5 The Application trait

import ChecksumAccumulator.calculate
object FallWinterSpringSummer extends App {
  for (season <- List("fall", "winter", "spring"))
    println(season +": "+ calculate(season))
}
