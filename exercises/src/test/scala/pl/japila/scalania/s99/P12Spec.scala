package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P12.decode

object P12Spec extends Specification {
  "P12 solution" should {
    "Decode a run-length encoded list." in {
      val expected = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val actual = decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
      actual === expected
    }
  }
}