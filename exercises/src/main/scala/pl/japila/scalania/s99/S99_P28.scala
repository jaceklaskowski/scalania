package pl.japila.scalania.s99

object S99_P28 {
  def solutions[T](): List[(String, Seq[Seq[T]] => Seq[Seq[T]])] = List(
    ("my own implementation", lsort))

  def solutionsFreq[T](): List[(String, Seq[Seq[T]] => Seq[Seq[T]])] = List(
    ("my own implementation", lsortFreq))

  def lsort[T](ts: Seq[Seq[T]]): Seq[Seq[T]] = ???
  def lsortFreq[T](tss: Seq[Seq[T]]): Seq[Seq[T]] = ???
}
