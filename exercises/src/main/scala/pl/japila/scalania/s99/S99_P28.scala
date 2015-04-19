package pl.japila.scalania.s99

object S99_P28 {
  type LsortFn[T] = Seq[Seq[T]] => Seq[Seq[T]]
  type LsortFreqFn[T] = Seq[Seq[T]] => Seq[Seq[T]]

  def solutions[T]: List[(String, LsortFn[T])] = List(
    ("my own implementation", lsort[T]))

  def solutionsFreq[T]: List[(String, LsortFreqFn[T])] = List(
    ("my own implementation", lsortFreq[T]))

  def lsort[T](ts: Seq[Seq[T]]): Seq[Seq[T]] = ???
  def lsortFreq[T](tss: Seq[Seq[T]]): Seq[Seq[T]] = ???
}
