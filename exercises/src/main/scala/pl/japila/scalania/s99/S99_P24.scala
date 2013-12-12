package pl.japila.scalania.s99

object S99_P24 {
  def solutions[T](): List[(String, (Int, Int) => Seq[Int])] = List(
    ("my own implementation", lotto)
  )

  def lotto(count: Int, max: Int): Seq[Int] = ???
}
