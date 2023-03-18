package Assignment_2

object ex4 {
  def lis11_2(uList: List[Int]):Unit ={
    val uList_Twice = uList.map(_ * 2)
    println(s"List elements doubled - $uList_Twice")

    def f(x: Int) = if (x > 2) x * x else None
    val uList_Squared = uList.map(f(_))
    println(s"List element squared selectively - $uList_Squared")
  }
  def lis11_3(uList: List[Int]): Unit= {
    def g(v: Int) = List(v - 1, v, v + 1)
    val uList_Extended = uList.map(g(_))
    println(s"Extended list using map - $uList_Extended")

    val uList_Extended_flatmap = uList.flatMap(g(_))
    println(s"Extended list using flatmap - $uList_Extended_flatmap")
  }
  def lis11_4(uList: List[Int]): Unit = {
    def f(x: Int) = if (x > 2) Some(x) else None
    val uList_Selective = uList.map(f(_))
    println(s"Selective elements of List using .map - $uList_Selective")

    val uList_Selective_flatmap = uList.flatMap(f(_))
    println(s"Selective elements of Lists with .flatMap - $uList_Selective_flatmap")
  }
  def lis11_5(uMap: Map[String, Int]): Unit = {
    val uMap_mapValues = uMap.mapValues(_ * 2).toMap
    println(s"Map values doubled using .mapValues - $uMap_mapValues")

    def h(k: Int, v: Int) = Some(k -> v * 2)

    val uMap_map = uMap.map{
      case(k, v) => h(k, v)
    }
    println(s"Map values doubled using .map - $uMap_map")

    val uMap_flatMap = uMap.flatMap{
      case(k, v) => h(k, v)
    }
    println(s"Map values doubled using .flatMap - $uMap_flatMap")
  }
  def main(args: Array[String]): Unit={
    val uList = List(1, 2, 3, 4, 5)
    val uMap = Map('a' -> 2, 'b' -> 4, 'c' -> 6)
    lis11_2(uList)
    lis11_3(uList)
    lis11_4(uList)
    lis11_5(uMap)
  }
}