package pl.japila.scalania.s99

object S99_P03 {
  def nth[T](n: Int, ts: Seq[T]): Option[T] = (n, ts) match {
    case (0, h :: _) => Some(h)
    case (_, _ :: tail) => nth(n - 1, tail)
    case (_, Nil) => None
  }

  def nth2[T](n: Int, ts: Seq[T]): Option[T] =
    if (n < 0) None
    else ts.drop(n).headOption
}
