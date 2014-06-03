package pl.japila.scalania.parallelCollections

import scala.collection.parallel.ParSeq

/**
 * Return the number that occurs the most times in the list.
 * You can assume that only one such number exists.
 * Example
 * {{{
 *   mostCommon(List(1, 2, 3, 2, 1, 2, 2, 3)) == 2
 * }}}
 */
object Ex3MostCommonNumber {
  def mostCommon(l: Seq[Int]): Int = {
    l.groupBy(identity).maxBy(_._2.length)._1
  }

  def mostCommon(l: ParSeq[Int]): Int = {
    ???
  }
}
