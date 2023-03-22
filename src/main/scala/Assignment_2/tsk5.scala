package Assignment_2

object tsk5 {
  def apply(l1: List[Int], l2: List[Int]): List[Int]={
    val l = l1.zip(l2).map{ case (x, y) => x + y }
    l
  }
  def main(args: Array[String]): Unit={
    val l1 = List(2, 6, 3, 4, 7)
    val l2 = List(5, 7, 2, 8, 9)
    println(apply(l1, l2))
  }
}
