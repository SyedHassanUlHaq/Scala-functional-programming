import scala.collection.mutable
object exe2 {
 def mapnset(): Unit = {
   var m1 = Map("surName" -> "Syed")
   m1 += ("Name" -> "Hassan")
   println(m1)

   val m2 = mutable.Map("surName" -> "syed")
   m2 += ("Name" -> "Hassan")
   println(m2)

   var s1 = Set("Syed")
   s1 += ("Hassan")
   println(s1)

   val s3 = mutable.Set("Syed")
   s3.add("Hassan")
   println(s3)
 }
  def main(args: Array[String]): Unit = {
    mapnset()
  }
}
