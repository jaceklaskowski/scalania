package pl.japila.scalania.s99

import scala.util.{ Failure, Try }

object S99_P01 {
  def last[T](ts: Seq[T]): Try[T] =
    ts match {
      case h +: Nil => Try(h)
      case h +: t => last(t)
      case _ => Failure(new NoSuchElementException)
    }

  // FIXME: How to keep alternative solutions?
  def last_2[T](ts: Seq[T]): Try[T] = Try(ts.last)
}
