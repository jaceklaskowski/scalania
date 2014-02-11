package pl.japila.scalania.s99

object S99_P28 {
  type lsortFunction[T] = Seq[Seq[T]] => Seq[Seq[T]]
  import S99_P28Comm.{ solutions => communitySolutions }
  def testSolutions[T](): List[(String, lsortFunction[T])] =
    solutions[T] ++ communitySolutions[T]

  type lsortFreqFunction[T] = Seq[Seq[T]] => Seq[Seq[T]]
  import S99_P28Comm.{ solutionsFreq => communitySolutionsFreq }
  def testSolutionsFreq[T](): List[(String, lsortFreqFunction[T])] =
    solutions[T] ++ communitySolutionsFreq[T]

  def solutions[T](): List[(String, lsortFunction[T])] = List(
    ("my own implementation", lsort))

  def solutionsFreq[T](): List[(String, lsortFreqFunction[T])] = List(
    ("my own implementation", lsortFreq))

  def lsort[T](ts: Seq[Seq[T]]): Seq[Seq[T]] = ???
  def lsortFreq[T](tss: Seq[Seq[T]]): Seq[Seq[T]] = ???
}
