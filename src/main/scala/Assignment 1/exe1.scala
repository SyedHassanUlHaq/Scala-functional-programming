object exe1 {
  def arr(x: String, y: String, z: String): Unit= {
    val a1: Array[String] = new Array[String](3)
    a1.update(0, x)
    a1.update(1, y)
    a1.update(2, z)
    println(a1.mkString(","))

    val a2: Array[String] = Array(x, y, z)
    println(a2.mkString(","))

    val a3: Array[String] = new Array[String](3)
    a3(0) = x
    a3(1) = y
    a3(2) = z
    println(a3.mkString(","))

    var a4: Array[String] = Array[String]()
    a4 = a4 :+ x
    a4 = a4 :+ y
    a4 = a4 :+ z
    println(a4.mkString(","))
  }
  def main(args: Array[String]): Unit ={
    arr("Hassan", "ul", "haq")
  }
}
