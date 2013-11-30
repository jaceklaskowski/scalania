package pl.japila.scalania.s99

object S99_P23 {
  def solutions[T](): List[(String, (Int, Seq[T]) => Seq[T])] = List(
    ("user function", randomSelect)
  )

  def randomSelect[T](count: Int, ts: Seq[T]): Seq[T] = ???
}
