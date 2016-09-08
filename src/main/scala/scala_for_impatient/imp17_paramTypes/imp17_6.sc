def middle[T](col:Iterable[T]) = {
  col.toList(col.size/2)
}
middle("World")


//def middle2[T <: Traversable[T]](col:T) = {
//  col.take(1)
//}
//middle2("World")