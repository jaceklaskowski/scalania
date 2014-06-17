package pl.japila.scalania.s99

object S99_P21 {
  def insertAt[T] = (toAdd: T, position: Int, ts: Seq[T]) => ???

  val solutions = Seq[(Any, Int, Seq[Any]) => Seq[Any]](insertAt)
}
