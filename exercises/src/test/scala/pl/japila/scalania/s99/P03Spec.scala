package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P03.nth

class P03Spec extends Specification {
  "P03 solution" should {
    "Find the Kth element of a list." in {
      nth(2, List(1, 1, 2, 3, 5, 8)) == 2
    }
  }
}