package Assignment_2

import scala.math
object ex1 {
  def poly(x: Int, a: Int = 3, b: Int = 5, c: Int = 7): Double = {
    (a * math.pow(x, 2)) + (b * x) + c
  }
  def main(args: Array[String]): Unit = {
    val x = Range(-3, 3).toList
    println(x.map(poly(_)))
  }
}