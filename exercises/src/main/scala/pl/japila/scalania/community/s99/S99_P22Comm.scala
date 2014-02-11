package pl.japila.scalania.s99

object S99_P22Comm {
  def solutions[T](): List[(String, (Int, Int) => Seq[Int])] = List( //("7680926", range_7680926),
    ("mprowaznik", range_mprowaznik),
    ("tboloo", range_tboloo),
    ("ajozwik", range_ajozwik),
    ("7681054", range_7681054)
  )

  def range_7680926(from: Int, to: Int): Seq[Int] = {
    if (to < from) {
      throw new IllegalArgumentException("Invalid range")
    }
    from match {
      case `to` => List(from)
      case x => List(from) ++ range_7680926(from + 1, to)
    }
  }

  def range_mprowaznik(from: Int, to: Int): Seq[Int] =
    (from to to).toList

  def range_tboloo(from: Int, to: Int): Seq[Int] =
    (from, to) match {
      case (from, to) if from != to => Seq(from) ++ range_tboloo(from + 1, to)
      case _ => Nil
    }

  def range_ajozwik(from: Int, to: Int): Seq[Int] = {
    def fromN(n: Int): Stream[Int] = n #:: fromN(n + 1)
    fromN(from).take(to - from + 1).toList
  }

  def range_7681054(from: Int, to: Int): Seq[Int] = {
    @annotation.tailrec
    def go(i: Int, acc: Seq[Int]): Seq[Int] = {
      if (i > to) acc.reverse
      else go(i + 1, i +: acc)
    }
    go(from, Seq())
  }
}