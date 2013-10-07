package pl.japila.scalania.s99

import org.specs2.mutable
import S99_P12.decode

class P12Spec extends mutable.Specification {
  "P12 solution" should {
    "Decode a run-length encoded list." in {
      val expected = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val actual = decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
      actual === expected
    }
  }
}