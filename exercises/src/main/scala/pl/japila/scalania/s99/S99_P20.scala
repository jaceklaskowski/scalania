package pl.japila.scalania.s99

object S99_P20 {

  val solutions = Seq[(Int, Seq[Any]) => (Seq[Any], Any)](
    removeAt,
    removeAt_jacekkolodziejski,
    removeAt_ajozwik
  )

  def removeAt[T] = (n: Int, ts: Seq[T]) => ???

  def removeAt_jacekkolodziejski[T] = (n: Int, ts: Seq[T]) =>
    (ts.take(n) ++ ts.drop(n + 1), ts(n))

  def removeAt_ajozwik[T] = (n: Int, ts: Seq[T]) => {
    val (l, _, t) = ts.foldLeft[(Seq[T], Int, Option[T])]((Seq[T](), n, None))((acc, el) => {
      if (acc._2 == 0) {
        (acc._1, acc._2 - 1, Some(el))
      } else {
        (el +: acc._1, acc._2 - 1, acc._3)
      }
    }
    )
    (l.reverse, t.get)
  }
}
