package pl.japila.scalania.s99

object S99_P24 {
  type LottoFn = (Int, Int) => Seq[Int]

  val solutions: List[(String, LottoFn)] = List(
    ("my own implementation", lotto)
  )

  def lotto(count: Int, max: Int): Seq[Int] = ???
}
