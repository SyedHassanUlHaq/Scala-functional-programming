package Assignment_2

object tsk8 {
  def convAny(x: Any, y: Any):String ={
    val m: String = x.toString
    val n: String = y.toString
    m ++ n
  }
  def main(args: Array[String]): Unit={
    println(convAny('o', 'k'))
  }
}
