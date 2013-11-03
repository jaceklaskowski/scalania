package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P22.range

class P22Spec extends Specification {
  "P22 solution" should {
    " Create a list containing all integers within a given range." in {
      range(4, 9) === List(4, 5, 6, 7, 8, 9)
    }
  }
}