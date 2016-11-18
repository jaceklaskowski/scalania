package pl.japila.scalania.collection

/**
 * Borrowed from http://stackoverflow.com/a/17705111/1305344
 */
object P05 {
  def groupWhen[A](itr: Iterator[A])(p: (A, A) => Boolean): Iterator[List[A]] = {
    @annotation.tailrec
    def groupWhen0(acc: Iterator[List[A]], itr: Iterator[A])(p: (A, A) => Boolean): Iterator[List[A]] = {
      val (dup1, dup2) = itr.duplicate
      val pref = ((dup1.sliding(2) takeWhile { case Seq(a1, a2) => p(a1, a2) }).zipWithIndex collect {
        case (seq, 0) => seq
        case (Seq(_, a), _) => Seq(a)
      }).flatten.toList
      val newAcc = if (pref.isEmpty) acc else acc ++ Iterator(pref)
      if (dup2.nonEmpty) {
        groupWhen0(newAcc, dup2 drop (pref.length max 1))(p)
      } else {
        newAcc
      }
    }
    groupWhen0(Iterator.empty, itr)(p)
  }
}
