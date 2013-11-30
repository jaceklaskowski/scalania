package pl.japila.scalania.s99

object S99_P21 {

  type InsertAtFn = (Any, Int, Seq[Any]) => Seq[Any]

  val solutions: List[(String, InsertAtFn)] = List(
    ("7680700", insertAt_7680700),
    ("PawelPanasewicz", insertAt_PawelPanasewicz),
    ("ajozwik", insertAt_ajozwik)
  )

  def insertAt_7680700[T](toAdd: T, position: Int, ts: Seq[T]) = {
    @annotation.tailrec
    def go(n: Int, l: List[T], r: List[T]): List[T] = {
      if (n == 0) l.reverse ::: toAdd :: r
      else go(n - 1, r.head :: l, r.tail)
    }
    go(position, Nil, ts.toList)
  }

  def insertAt_PawelPanasewicz[T](toAdd: T, position: Int, ts: Seq[T]) =
    ts.patch(position, Seq(toAdd), 0)

  def insertAt_ajozwik[T](toAdd: T, position: Int, ts: Seq[T]) = {
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
