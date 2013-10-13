package pl.japila.scalania.s99

object S99_P13 {
  def encodeDirect[T](ts: Seq[T]): Seq[(Int, T)] =
    if (ts.isEmpty) Nil
    else {
      val (packed, next) = ts.span(_ == ts.head)
      (packed.length, packed.head) +: encodeDirect(next)
    }
}
