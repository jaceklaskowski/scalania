package pl.japila.scalania.s99

object S99_P20 {

  type RemoveAtFn = (Int, Seq[Any]) => (Seq[Any], Any)

  val solutions: List[(String, RemoveAtFn)] = List(
    ("jacekkolodziejski", removeAt_jacekkolodziejski),
    ("ajozwik", removeAt_ajozwik)
  )

  def removeAt_jacekkolodziejski[T](n: Int, ts: Seq[T]): (Seq[Any], Any) =
    (ts.take(n) ++ ts.drop(n + 1), ts(n))

  def removeAt_ajozwik[T](n: Int, ts: Seq[T]): (Seq[Any], Any) = {
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
