package pl.japila.scalania.parallelCollections

import scala.collection.parallel.ParSeq

/**
 * Return an element that is the third maximal element in the collection.
 * Duplicated elements are counted only once, so
 * {{{
 *   third(Seq(1,2,3,3,4)) == 2
 * }}}
 */
object Ex1ThirdElement {
  def third(col: Seq[Int]): Int = {
    col.toSet.toList.sortBy((x: Int) => -x).apply(2)
  }

  def third(col: ParSeq[Int]): Int = {
    ???
  }
}
