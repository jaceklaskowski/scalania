package pl.japila.scalania.s99

object S99_P22 {

  val solutions = Seq[(Int, Int) => Seq[Int]](
    range,
    range_7680926,
    range_mprowaznik,
    range_tboloo,
    range_ajozwik,
    range_7681054
  )

  def range = (from: Int, to: Int) => ???

  def range_7680926: (Int, Int) => Seq[Int] = (from, to) => {
    if (to < from) {
      throw new IllegalArgumentException("Invalid range")
    }
    from match {
      case `to` => List(from)
      case x => List(from) ++ range_7680926(from + 1, to)
    }
  }

  def range_mprowaznik = (from: Int, to: Int) =>
    (from to to).toList

  def range_tboloo: (Int, Int) => Seq[Int] = (from, to) =>
    (from, to) match {
      case (from, to) if from != to => Seq(from) ++ range_tboloo(from + 1, to)
      case _ => Nil
    }

  def range_ajozwik = (from: Int, to: Int) => {
    def fromN(n: Int): Stream[Int] = n #:: fromN(n + 1)
    fromN(from).take(to - from + 1).toList
  }

  def range_7681054 = (from: Int, to: Int) => {
    @annotation.tailrec
    def go(i: Int, acc: Seq[Int]): Seq[Int] = {
      if (i > to) acc.reverse
      else go(i + 1, i +: acc)
    }
    go(from, Seq())
  }
}
