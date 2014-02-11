package pl.japila.scalania.s99

object S99_P23 {
  type randomSelectFunction[T] = (Int, Seq[T]) => Seq[T]
  import S99_P23Comm.{ solutions => communitySolutions }
  def testSolutions[T](): List[(String, randomSelectFunction[T])] =
    solutions[T] ++ communitySolutions[T]

  def solutions[T](): List[(String, randomSelectFunction[T])] = List(
    ("my own implementation", randomSelect[T])
  )

  def randomSelect[T](count: Int, ts: Seq[T]): Seq[T] = ???
}
