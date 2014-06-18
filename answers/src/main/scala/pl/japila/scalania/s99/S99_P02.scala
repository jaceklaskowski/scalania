package pl.japila.scalania.s99

object S99_P02 {
  def penultimate[T](ts: Seq[T]): Option[T] = ts match {
    case _ :: _ => ts.reverse.tail.headOption
    case Seq() => None
  }
}
