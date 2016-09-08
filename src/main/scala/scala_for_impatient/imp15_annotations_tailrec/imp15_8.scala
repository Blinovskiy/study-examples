package scala_for_impatient.imp15_annotations_tailrec

/**
  * Created by User on 5/11/2016.
  */
object imp15_8 extends App {
  def allDifferent[@specialized T](x: T, y: T, z: T) = {println(x.getClass);x !=y && x!=z && y!=z}
  def allDifferentWrapped[T](x: T, y: T, z: T) = {println(x.getClass);x !=y && x!=z && y!=z}

  val res = allDifferent(5,6,7)
  val resWrapped = allDifferentWrapped(5,6,7)
}
