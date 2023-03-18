package Assignment_2
import scala.Byte.MaxValue
import scala.math
object ex2 {
  def poly(x: Int, a: Int = 3, b: Int = 5, c: Int = 7): Double = {
    (a * math.pow(x, 2)) + (b * x) + c
  }

  def main(args: Array[String]): Unit = {
    val x = Range(-3, 3).toList
    val polyList = x.map(poly(_))
    val zipList = x zip polyList
    val indziplst = zipList.zipWithIndex
    val mean = (polyList.sum) / polyList.length
    println(indziplst)
    println(mean)
  }
}
