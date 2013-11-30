package pl.japila.scalania.s99

object S99_P22 {

  type RangeFn = (Int, Int) => Seq[Int]

  val solutions: List[(String, RangeFn)] = List(
    ("my own implementation", range)
  )

  def range(from: Int, to: Int): Seq[Int] = ???
}
