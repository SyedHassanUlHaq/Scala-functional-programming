object exe3 {
  def opt(x: Option[String]): Unit ={
    if (x != None){
      println(x, "is absent")
    }else{
      println("It's a House Full")
    }
  }
  def main(args: Array[String]): Unit ={
    opt(Some("Hassan"))
    opt(None)
  }
}
