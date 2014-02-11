package pl.japila.scalania.s99

object S99_P20 {
  type removeAtFunction = (Int, Seq[Any]) => (Seq[Any], Any)
  import S99_P20Comm.{ solutions => communitySolutions }
  def testSolutions[T](): List[(String, removeAtFunction)] =
    solutions ++ communitySolutions

  def solutions[T](): List[(String, removeAtFunction)] = List(
    ("my own implementation", removeAt)
  )

  def removeAt[T](n: Int, ts: Seq[T]): (Seq[Any], Any) = ???

}
