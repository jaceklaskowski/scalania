package pl.japila.scalania.s99

object S99_P27 {
  type GroupFn[T] = Seq[T] => Seq[Seq[Seq[T]]]
  type GroupGeneralizedFn[T] = (Seq[Int], Seq[T]) => Seq[Seq[Seq[T]]]

  def solutions[T]: List[(String, GroupFn[T])] = List(
    ("my own implementation", group)
  )

  def solutionsGen[T](): List[(String, GroupGeneralizedFn[T])] = List(
    ("my own implementation", groupGeneralized)
  )

  def group[T](ts: Seq[T]): Seq[Seq[Seq[T]]] = ???
  def groupGeneralized[T](groups: Seq[Int], ts: Seq[T]): Seq[Seq[Seq[T]]] = ???
}
