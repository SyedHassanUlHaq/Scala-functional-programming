object Task5 {
  def buildMap[A, B](data: Seq[A], f: A => B): Map[A, B] = {
    def map(seq: Seq[A], res: Map[A, B]): Map[A, B] = {
      if (seq.length == 0) {
        res
      }
      else {
        val item = f(seq(0))
        map(seq.tail, res + (seq(0) -> item))
      }
    }

    map(data, Map[A, B]())
  }

  def main(args: Array[String]): Unit = {
    val lst = Array(1, 2, 3, 4, 5)

    def func(x: Int): Boolean = {
      if (x % 2 == 0){
        true
      }else{
        false
      }
    } // entry is even or not

    val result = buildMap(lst, func)
    println(result)
  }
}
