package pl.japila.scalania.s99

import org.specs2.mutable
import S99_P05.reverse

class P05Spec extends mutable.Specification {
  "P05 solution" should {
    "Reverse a list." in {
      reverse(List(1, 1, 2, 3, 5, 8)) === List(8, 5, 3, 2, 1, 1)
    }
  }
}