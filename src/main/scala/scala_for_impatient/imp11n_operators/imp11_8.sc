class Matrix(m: Int, n: Int) {

  private var matrix = Array.ofDim[Int](m, n)

  def this(matrixArray: Array[Array[Int]]) {
    this(matrixArray.length, matrixArray(0).length)
    matrix = matrixArray
  }

  def mat(row: Int, col: Int): Int = {
    matrix(row)(col)
  }

  def fill(value: Int): Unit = {
    matrix = Array.fill[Int](m, n)(value)
  }

  def fillRandom(maxValue: Int): Unit = {
    matrix = Array.fill[Int](m, n)(scala.util.Random.nextInt(maxValue))
  }

  def printMatrix(): Unit = {
    for {
      i <- 0 until m
      j <- 0 until n
    } println(s"($i)($j) = ${matrix(i)(j)}")
  }

  def prettyPrintMatrix(): Unit = {
    // col underlines
    print("%4s".format(" "))
    for (k <- 0 until n) {
      print("%5d".format(k))
    }
    println()
    // col numbers
    print("%4s".format(" "))
    for (k <- 0 until n) {
      print("%5s".format("-----"))
    }
    println()

    for (i <- 0 until m) {
      print("%3d|".format(i)) // row numbers
      for (j <- 0 until n) {
        print("%5d".format(matrix(i)(j)))
      }
      println()
    }
  }

  def +(that: Matrix): Matrix = {
    val newMatrix = Array.ofDim[Int](m, n) // new Array[Array[Int]](n)(m) //
    for {
      i <- 0 until m
      j <- 0 until n
    } {
      newMatrix(i)(j) = matrix(i)(j) + that.matrix(i)(j)
    }
    new Matrix(newMatrix)
  }

  def -(that: Matrix): Matrix = {
    val newMatrix = Array.ofDim[Int](m, n) // new Array[Array[Int]](n)(m) //
    for {
      i <- 0 until m
      j <- 0 until n
    } {
      newMatrix(i)(j) = matrix(i)(j) - that.matrix(i)(j)
    }
    new Matrix(newMatrix)
  }

  override def toString: String = {
    printMatrix; super.toString
  }
}

val mtrx = new Matrix(10, 10)
//mtrx.fillRandom(10)
mtrx.fill(8)
//mtrx.printMatrix
//mtrx.prettyPrintMatrix
//mtrx.mat(1, 1)

val mtrx1 = new Matrix(10, 10)
mtrx1.fill(2)

val mtrxSum = mtrx + mtrx1
mtrxSum.prettyPrintMatrix




