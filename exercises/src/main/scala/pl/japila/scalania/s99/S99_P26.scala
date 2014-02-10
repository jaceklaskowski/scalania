package pl.japila.scalania.s99

object S99_P26 {
  def solutions[T](): List[(String, (Int, Seq[T]) => Seq[Seq[T]])] = List(
    ("my own implementation", combinations)
  )

  def combinations[T](count: Int, ts: Seq[T]): Seq[Seq[T]] = ???
}
