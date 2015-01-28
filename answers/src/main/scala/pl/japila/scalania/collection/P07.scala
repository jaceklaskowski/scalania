package pl.japila.scalania.collection

/**
 * Inspired by http://stackoverflow.com/q/28169423/1305344
 */
object P07 {
  def sumOfPrecedingElements(ns: Seq[Int]): Seq[Int] = {
    def loop(ns: Seq[Int], acc: Int): Seq[Int] = {
      ns match {
        case Seq() => ns
        case head :: tail => (head + acc) +: loop(tail, head + acc)
      }
    }
    loop(ns, 0)
  }

}
