package pl.japila.scalania.s99

object S99_P12 {
  def decode[T](its: Seq[(Int, T)]): Seq[T] = its.flatMap(e => List.fill(e._1)(e._2))

  // FIXME: How to keep alternative solutions?
  def decode_2[T](its: Seq[(Int, T)]): Seq[T] =
    its.foldLeft(Seq[T]())(method).reverse

  def method[T](s: Seq[T], e: (Int, T)) =
    fill(e._1)(e._2) ++ s

  def fill[T](n: Int)(e: T): Seq[T] = n match {
    case 0 => Nil
    case _ => e +: fill(n - 1)(e)
  }
}
