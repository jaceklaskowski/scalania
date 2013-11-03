package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P07.flatten

class P07Spec extends Specification {
  "P07 solution" should {
    "Flatten a nested list structure" in {
      flatten(List(List(1, 1), 2, List(3, List(5, 8)))) === List(1, 1, 2, 3, 5, 8)
      flatten(Nil) === Nil
      flatten(List(Nil, List(Nil))) === Nil
    }
  }
}