object Task3 {
  def arrSum(arr1: Array[Double], arr2: Array[Double]): Unit = {
    require(arr1.length == arr2.length, "both arrays must have same length")
    val sumArr = new Array[Double](arr1.length)
    for (i <- 0 until arr1.length) {
      sumArr(i) = arr1(i) + arr2(i)
    }
    println(sumArr.mkString(","))
  }
  def main(args: Array[String]):Unit = {
    arrSum(Array(4, 7, 5, 3), Array(7, 8, 3, 4))
  }
}
