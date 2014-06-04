package pl.japila.scalania.parallelCollections

import scala.collection.parallel.ParSeq
import scala.collection.immutable.TreeSet

/**
 * Return an element that is the third maximal element in the collection.
 * Duplicated elements are counted only once, so
 * {{{
 *   third(Seq(1,2,3,3,4)) == 2
 * }}}
 */
object Ex1ThirdElement {
  def third(col: Seq[Int]): Int = {
    var bestSet = TreeSet.empty[Int](Ordering[Int].reverse)
    var worstInSet = Integer.MIN_VALUE
    col.foreach {
      el =>
        if (el > worstInSet) {
          bestSet += el
        }
        bestSet = bestSet.take(3)
        worstInSet = bestSet.min
    }
    worstInSet
  }

  def third(col: ParSeq[Int]): Int = {
    ???
  }
}
