package pl.japila.scalania.s99

import org.specs2.mutable
import S99_P20.removeAt

class P20Spec extends mutable.Specification {
  "P20 solution" should {
    " Remove the Kth element from a list." in {
      val out = removeAt(1, List('a, 'b, 'c, 'd))
      out._1 === List('a, 'c, 'd)
      out._2 == 'b
    }
  }
}