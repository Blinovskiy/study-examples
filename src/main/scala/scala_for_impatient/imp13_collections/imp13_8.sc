
def arrToMultiArr(array: Array[Double],elemsInArray: Int): Array[Array[Double]] = {
  array.grouped(elemsInArray).toArray
}

val arr = Array(23.1,12.2,11.1,53.0,33.23,17.9,36.6,42.1,0.43)
val arrDim = arrToMultiArr(arr,3)
arrDim foreach { row => row foreach {col =>  print("%-5.2f ".format(col))}; println }