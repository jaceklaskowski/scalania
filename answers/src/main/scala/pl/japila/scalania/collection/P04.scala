package pl.japila.scalania.collection

object P04 {
  def groupIndexed[T](ts: Seq[(T, Int)]): Map[T, Seq[Int]] = {
    def decode(end: Int, ns: Seq[Int]): Seq[Int] =
      (1 to end).map(collection.BitSet(ns: _*)).map(b => if (b) 1 else 0)

    val mx = ts.maxBy(_._2)._2
    ts.groupBy(_._1).map { case (k, v) => k -> decode(mx, v.map(_._2)) }
  }
}
