package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P11.encodeModified

class P11Spec extends Specification {
  "P11 solution" should {
    "Do modified run-length encoding" in {
      val actual = encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      val expected = List(Left((4, 'a)), Right('b), Left((2, 'c)), Left((2, 'a)), Right('d), Left((4, 'e)))
      actual mustEqual expected
    }
    "Applied to an empty list return an empty list" in {
      encodeModified(Nil) mustEqual Nil
    }
  }
}