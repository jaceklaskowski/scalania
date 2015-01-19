package pl.japila.scalania.collection

object P04 {
  def groupIndexed[T](m: Seq[(T, Int)]): Map[T, Seq[Int]] = {
    def numToIndices(num: Int): Seq[Int] = {
      if (num > 1) 0 +: numToIndices(num - 1)
      else Seq(1)
    }

    def mapToIndices[T](lastProcced: Int, s: Seq[Int]): Seq[Int] = {
      s match {
        case head +: tail => numToIndices(head - lastProcced) ++ mapToIndices(head, tail)
        case Seq() => s
      }
    }

    m.groupBy(_._1).mapValues(_.map(_._2)).mapValues(xs => mapToIndices(0, xs.sorted))
  }
}
