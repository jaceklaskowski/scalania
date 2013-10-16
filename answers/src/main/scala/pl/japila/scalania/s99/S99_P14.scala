package pl.japila.scalania.s99

object S99_P14 {
  def duplicate[T](ts: Seq[T]): Seq[T] = ts.flatMap(e => List(e, e))
}
