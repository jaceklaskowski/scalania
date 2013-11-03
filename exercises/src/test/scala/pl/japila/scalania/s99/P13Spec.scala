package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P13.encodeDirect

class P13Spec extends Specification {
  "P13 solution" should {
    "Run-length encoding of a list (direct solution)." in {
      val expected = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
      val actual = encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      actual === expected
    }
  }
}