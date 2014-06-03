package pl.japila.scalania.parallelCollections

import scala.collection.parallel.ParSeq

/**
 * Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
 * Example:
 * {{{
 *   scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
 *   res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
 * }}}
 */
object Ex2P12DecodeSeq {
  def decode(l: Seq[(Int, Symbol)]): Seq[Symbol] = {
    l.flatMap { case (a, b) => List.fill(a)(b) }
  }

  def decode(l: ParSeq[(Int, Symbol)]): ParSeq[Symbol] = {
    ???
  }
}
