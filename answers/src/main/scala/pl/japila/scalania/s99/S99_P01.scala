package pl.japila.scalania.s99

object S99_P01 {
  def last[T](ts: List[T]): T =
    ts match {
      case List(e) => e
      case h :: t => last(t)
      case _ => throw new NoSuchElementException
    }

  // FIXME: How to keep alternative solutions?
  def last_2[A](l: List[A]): A = l.last
}
