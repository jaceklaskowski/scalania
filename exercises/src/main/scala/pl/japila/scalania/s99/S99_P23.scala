package pl.japila.scalania.s99

object S99_P23 {
  def solutions[T](): List[(String, (Int, Seq[T]) => Seq[T])] = List(
    ("my own implementation", randomSelect)
  )

  def randomSelect[T](count: Int, ts: Seq[T]): Seq[T] = ???
}
