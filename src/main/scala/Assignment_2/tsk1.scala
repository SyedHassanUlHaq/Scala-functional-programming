package Assignment_2

  sealed trait State
  case object Idle extends State
  case object Active extends State

  sealed trait Event
  case object Start extends Event
  case object Increment extends Event
  case object Stop extends Event

  case class Data(count: Int)

  object CounterFSM{
    def apply(events: List[Event]): Unit = {
      def loop(state: State, data: Data, remainingEvents: List[Event]): Unit = remainingEvents match {
        case Nil =>
          println("FSM finished")
        case event :: tail =>
          val (newState, newData) = counterFSM(state, data, event)
          loop(newState, newData, tail)
      }

      def counterFSM(state: State, data: Data, event: Event): (State, Data) = (state, event) match {
        case (Idle, Start) =>
          println("Counter started")
          (Active, Data(0))
        case (Active, Increment) =>
          val newCount = data.count + 1
          println(s"Counter incremented to $newCount")
          (Active, data.copy(count = newCount))
        case (Active, Stop) =>
          println(s"Counter stopped at ${data.count}")
          (Idle, Data(0))
        case _ =>
          (state, data)
      }

      loop(Idle, Data(0), events)
    }
  }

object main {
  def main(args: Array[String]): Unit ={
    val x = List(Start, Increment, Increment, Increment, Stop)
    CounterFSM(x)
  }
}