package pl.japila.scalania.s99

object S99_P26 {
  type combinationsFunction[T] = (Int, Seq[T]) => Seq[Seq[T]]
  import S99_P26Comm.{ solutions => communitySolutions }
  def testSolutions[T](): List[(String, combinationsFunction[T])] =
    solutions[T] ++ communitySolutions[T]

  def solutions[T](): List[(String, combinationsFunction[T])] = List(
    ("my own implementation", combinations[T])
  )

  def combinations[T](count: Int, ts: Seq[T]): Seq[Seq[T]] = ???
}
