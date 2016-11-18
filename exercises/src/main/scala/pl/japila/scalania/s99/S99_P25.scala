package pl.japila.scalania.s99

object S99_P25 {
  type RandomPermuteFn[T] = Seq[T] => Seq[T]

  def solutions[T]: List[(String, RandomPermuteFn[T])] = List(
    ("my own implementation", randomPermute[T])
  )

  def randomPermute[T](ts: Seq[T]): Seq[T] = ???
}
