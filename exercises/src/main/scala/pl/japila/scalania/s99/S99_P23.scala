package pl.japila.scalania.s99

object S99_P23 {
  type RandomSelectFn[T] = (Int, Seq[T]) => Seq[T]

  def solutions[T]: List[(String, RandomSelectFn[T])] = List(
    ("my own implementation", randomSelect)
  )

  def randomSelect[T](count: Int, ts: Seq[T]): Seq[T] = ???
}
