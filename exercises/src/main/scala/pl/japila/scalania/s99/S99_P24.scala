package pl.japila.scalania.s99

object S99_P24 {
  type lottoFunction = (Int, Int) => Seq[Int]
  import S99_P24Comm.{ solutions => communitySolutions }
  def testSolutions[T](): List[(String, lottoFunction)] =
    solutions ++ communitySolutions

  def solutions[T](): List[(String, lottoFunction)] = List(
    ("my own implementation", lotto)
  )

  def lotto(count: Int, max: Int): Seq[Int] = ???
}
