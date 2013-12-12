package pl.japila.scalania.s99

object S99_P27 {
  def solutions[T](): List[(String, Seq[T] => Seq[Seq[Seq[T]]])] = List(
    ("my own implementation", group)
  )

  def solutions3[T](): List[(String, (Seq[Int], Seq[T]) => Seq[Seq[Seq[T]]])] = List(
    ("my own implementation", groupGeneralized)
  )

  def group[T](ts: Seq[T]): Seq[Seq[Seq[T]]] = ???
  def groupGeneralized[T](groups: Seq[Int], ts: Seq[T]): Seq[Seq[Seq[T]]] = ???
}
