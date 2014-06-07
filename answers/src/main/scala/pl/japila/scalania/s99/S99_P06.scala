package pl.japila.scalania.s99

object S99_P06 {
  def isPalindrome[T](ts: Seq[T]): Boolean =
    ts.foldLeft((true, ts))(caseFn)._1

  def caseFn[T](resTsInit: (Boolean, Seq[T]), t: T): (Boolean, Seq[T]) = resTsInit match {
    case (res, tsInit) => (res && (t == tsInit.last), tsInit.init)
  }
}
