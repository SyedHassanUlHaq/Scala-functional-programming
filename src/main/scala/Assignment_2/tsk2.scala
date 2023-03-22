package Assignment_2

object tsk2 {
  case class FSM(machine: String)
    def main(args: Array[String]): Unit={
      val f1 = FSM("TrafficLight")
      val f2 = f1.copy()
      println(f2)
    }
  }
