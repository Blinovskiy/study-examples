def unless(condition: => Boolean)(block: => Unit): Unit = {
  if (!condition) {
    block
  }
}

unless(true){
  println("true") // Not reachable
}
unless(false){
  println("false")
}