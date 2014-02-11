package pl.japila.scalania.s99

object S99_P21 {
  type insertAtFunction = (Any, Int, Seq[Any]) => Seq[Any]
  import S99_P21Comm.{ solutions => communitySolutions }
  def testSolutions[T](): List[(String, insertAtFunction)] =
    solutions ++ communitySolutions

  def solutions[T](): List[(String, insertAtFunction)] = List(
    ("my own implementation", insertAt)
  )

  def insertAt[T](toAdd: T, position: Int, ts: Seq[T]): Seq[Any] = ???
}
