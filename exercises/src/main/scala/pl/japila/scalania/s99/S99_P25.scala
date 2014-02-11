package pl.japila.scalania.s99

object S99_P25 {
  type randomPermuteFunction[T] = Seq[T] => Seq[T]
  import S99_P25Comm.{ solutions => communitySolutions }
  def testSolutions[T](): List[(String, randomPermuteFunction[T])] =
    solutions[T] ++ communitySolutions[T]

  def solutions[T](): List[(String, randomPermuteFunction[T])] = List(
    ("my own implementation", randomPermute[T])
  )

  def randomPermute[T](ts: Seq[T]): Seq[T] = ???
}
