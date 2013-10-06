package pl.japila.scalania.s99

import org.specs2.mutable
import S99_P02.penultimate

class P02Spec extends mutable.Specification {
  "P02 solution" should {
    "Find the last but one element of a list." in {
      penultimate(List(1, 1, 2, 3, 5, 8)) == 5
    }
  }
}