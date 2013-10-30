package pl.japila.scalania.s99

import org.specs2.mutable
import S99_P20.removeAt

class P20Spec extends mutable.Specification {
  "P20 solution" should {
    "Remove the Kth element from a list." in {
      val (ts, t) = removeAt(1, List('a, 'b, 'c, 'd))
      ts === List('a, 'c, 'd)
      t === 'b
    }
  }
}