package pl.japila.scalania.s99

import org.specs2.mutable
import S99_P01.last

class P01Spec extends mutable.Specification {
  "P01 solution" should {
    "Find the last element of a list" in {
      last(List(1, 1, 2, 3, 5, 8)) == 8
    }
  }
}