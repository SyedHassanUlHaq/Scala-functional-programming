import scala.annotation.tailrec
import util.Random
object Task4 {
  @tailrec
  def numEven(arr: Array[Int], count: Int = 0):Int = {
    val n = arr.length
    if (n == 0) {
      count
    } else if (arr(0) % 2 == 0) {
      numEven(arr.slice(1, n), count + 1)
    } else numEven(arr.slice(1, n), count)
  }
  def numEven2(arr: Array[Int]):Int ={
    val count = arr.count(x => x % 2 == 0)
    count
  }
  def main(args: Array[String]): Unit={
    val a = Array.fill(100)(Random.nextInt(100))
    println(numEven(a))
    println(numEven2(a))
  }
}
