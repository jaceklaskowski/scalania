package pl.japila.scalania.s99

import org.specs2.mutable
import S99_P10.encode

class P10Spec extends mutable.Specification {
  "P10 solution" should {
    "Run-length encoding of a list." in {
      val actual = encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      val expected = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
      actual mustEqual expected
    }
  }
}