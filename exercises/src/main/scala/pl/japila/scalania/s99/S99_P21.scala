package pl.japila.scalania.s99

object S99_P21 {

  type InsertAtFn = (Any, Int, Seq[Any]) => Seq[Any]

  val solutions: List[(String, InsertAtFn)] = List(
    ("my own implementation", insertAt)
  )

  def insertAt[T](toAdd: T, position: Int, ts: Seq[T]): Seq[Any] = ???
}
