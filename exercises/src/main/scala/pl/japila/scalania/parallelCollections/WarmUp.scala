package pl.japila.scalania.parallelCollections

import scala.collection.parallel.ParSeq

object WarmUp {
  def add1Seq(col: Seq[Int]): Seq[Int] = {
    col.map(x => x + 1)
  }

  def add1Par(col: Seq[Int]): Seq[Int] = {
    add1Par(col.par).seq
  }

  def add1Par(col: ParSeq[Int]): ParSeq[Int] = {
    col.map(x => x + 1)
  }
}
