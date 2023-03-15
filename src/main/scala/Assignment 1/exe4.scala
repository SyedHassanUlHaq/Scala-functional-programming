object exe4 {
 def highorder(): Unit = {
   val arr = Array("Hassan")

   val arr2 = arr.map(_ * 2)
   println(arr2.mkString(","))

   val arr1 = arr.reduce(_ + _)
   println(arr1.mkString(","))

   val ar = Array(5, 6, 7, 8)
   val arr3 = ar.foldLeft(0)(_ + _)
   println(arr3)
   val arr4 = ar.foldRight(0)(_ + _)
   print(arr4)

   val arr5 = ar.filter(_ % 2 != 0)
   println(arr5.mkString(","))
 }
  def main(args: Array[String]): Unit = {
    highorder()
  }
}
