package pl.japila.scalania.s99

object S99_P27 {
  type groupFunction[T] = Seq[T] => Seq[Seq[Seq[T]]]
  import S99_P27Comm.{ solutions => communitySolutions }
  def testSolutions[T](): List[(String, groupFunction[T])] =
    solutions[T] ++ communitySolutions[T]

  type groupGeneralizedFunction[T] = (Seq[Int], Seq[T]) => Seq[Seq[Seq[T]]]
  import S99_P27Comm.{ solutions3 => communitySolutions3 }
  def testSolutions3[T](): List[(String, groupGeneralizedFunction[T])] =
    solutions3[T] ++ communitySolutions3[T]

  def solutions[T](): List[(String, groupFunction[T])] = List(
    ("my own implementation", group)
  )

  def solutions3[T](): List[(String, groupGeneralizedFunction[T])] = List(
    ("my own implementation", groupGeneralized)
  )

  def group[T](ts: Seq[T]): Seq[Seq[Seq[T]]] = ???
  def groupGeneralized[T](groups: Seq[Int], ts: Seq[T]): Seq[Seq[Seq[T]]] = ???
}
