package Assignment_2

object ex3 {
  def euclidean_sum(vec: Vector[Int]): Int = {
    vec.sum
  }
  def euclidean_square(vec: Vector[Int]): Vector[Int]= {
    vec.map(x => x*x)
  }
  def euclidean(vec: Vector[Int]):Int ={
    euclidean_sum(euclidean_square(vec))
  }
  def main(args: Array[String]): Unit={
    val myvec = Vector(3, 6, 4)
    println(euclidean(myvec))
  }
}