package pl.japila.scalania.s99

object S99_P13 {
  /**
   * Implement the so-called run-length encoding data compression method directly, i.e.
   * don't use other methods you've written (like P09's pack); do all the work directly.
   *
   * scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
   * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
   */
  def encodeDirect[T](ts: Seq[T]): Seq[(Int, T)] = ???
}
