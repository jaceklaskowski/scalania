package pl.japila.scalania.s99

object S99_P26 {
  type CombinationsFn[T] = (Int, Seq[T]) => Seq[Seq[T]]

  def solutions[T](): List[(String, CombinationsFn[T])] = List(
    ("my own implementation", combinations[T])
  )

  def combinations[T](count: Int, ts: Seq[T]): Seq[Seq[T]] = ???
}
