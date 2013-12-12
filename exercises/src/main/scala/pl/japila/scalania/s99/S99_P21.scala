package pl.japila.scalania.s99

object S99_P21 {
  def solutions[T](): List[(String, (Any, Int, Seq[Any]) => Seq[Any])] = List(
    ("my own implementation", insertAt),
    ("tboloo", insertAt_tboloo),
    ("7680700", insertAt_7680700),
    ("PawelPanasewicz", insertAt_PawelPanasewicz),
    ("ajozwik", insertAt_ajozwik)
  )

  def insertAt[T](toAdd: T, position: Int, ts: Seq[T]): Seq[Any] = ???

  def insertAt_tboloo[T](toAdd: T, position: Int, ts: Seq[T]): Seq[Any] = {
    (position, ts) match {
      case (0, h :: t) => Seq(toAdd) ++ t
      case (position, h :: t) => Seq(h) ++ insertAt_tboloo(toAdd, position - 1, t)
    }
  }

  def insertAt_7680700[T](toAdd: T, position: Int, ts: Seq[T]): Seq[Any] = {
    @annotation.tailrec
    def go(n: Int, l: List[T], r: List[T]): List[T] = {
      if (n == 0) l.reverse ::: toAdd :: r
      else go(n - 1, r.head :: l, r.tail)
    }
    go(position, Nil, ts.toList)
  }

  def insertAt_PawelPanasewicz[T](toAdd: T, position: Int, ts: Seq[T]): Seq[Any] =
    ts.patch(position, Seq(toAdd), 0)

  def insertAt_ajozwik[T](toAdd: T, position: Int, ts: Seq[T]): Seq[Any] = {
    def insertToAcc: ((Seq[T], Int), T) => (Seq[T], Int) = {
      (acc, current) =>
        {
          val (seq, index) = acc
          if (index == 0) {
            (current +: toAdd +: seq, index - 1)
          } else {
            (current +: seq, index - 1)
          }
        }
    }
    val (l, _) = ts.foldLeft[(Seq[T], Int)]((Seq[T](), position))(insertToAcc)
    l.reverse
  }
}
