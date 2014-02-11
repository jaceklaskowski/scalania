package pl.japila.scalania.s99

object S99_P22 {
  type rangeFunction = (Int, Int) => Seq[Int]
  import S99_P22Comm.{ solutions => communitySolutions }
  def testSolutions[T](): List[(String, rangeFunction)] =
    solutions ++ communitySolutions

  def solutions[T](): List[(String, rangeFunction)] = List(
    ("my own implementation", range)
  )

  def range(from: Int, to: Int): Seq[Int] = ???
}
