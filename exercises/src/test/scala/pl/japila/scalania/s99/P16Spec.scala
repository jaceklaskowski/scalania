package pl.japila.scalania.s99

import org.specs2.mutable
import S99_P16.drop

class P16Spec extends mutable.Specification {
  "P16 solution" should {
    "Drop every Nth element from a list." in {
      val expected = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
      val actual = drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual === expected
    }
  }
}