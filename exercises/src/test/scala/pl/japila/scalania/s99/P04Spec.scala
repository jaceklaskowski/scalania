package pl.japila.scalania.s99

import org.specs2.mutable._

object P04Spec extends Specification {
  "P04 solution" should {
    "Find the number of elements of a list." in {
      S99_P04.length(List(1, 1, 2, 3, 5, 8)) === 6
    }
  }
}