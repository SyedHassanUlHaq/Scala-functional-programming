import scala.annotation.tailrec

object Task2{
  def CharArray (start: Int): Any={
    @tailrec
    def rec(asci: Int, list: List[Char]):Any  ={
      if (asci > 122){
        list
      }else if(asci >= 97 && asci <= 122){
        rec(asci + 1, list :+ asci.toChar)
      }else{
        rec(97, list)
      }
    }
    rec(start.toChar, Nil)
  }

  def main(args: Array[String]):Unit ={
    val list = CharArray(97)
    println(list)
  }
}