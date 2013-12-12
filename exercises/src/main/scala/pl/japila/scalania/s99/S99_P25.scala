package pl.japila.scalania.s99

object S99_P25 {
  def solutions[T](): List[(String, Seq[T] => Seq[T])] = List(
    ("my own implementation", randomPermute)
  )

  def randomPermute[T](ts: Seq[T]): Seq[T] = ???
}
