package pl.japila.scalania.s99

object S99_P16 {
  def drop[T](n: Int, ts: Seq[T]): Seq[T] =
    ts.zipWithIndex.filter(p => (p._2 + 1) % n != 0).map(_._1)
}
