package Assignment_2

object tsk7 {
  implicit def strToInt(x: String): Int={
    x.toInt
  }
  def main(args: Array[String]): Unit= {
    import tsk7.strToInt
    val x: String = "27"
    val num: Int = x
    println(num)
  }
}
