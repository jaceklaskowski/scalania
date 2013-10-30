package pl.japila.scalania.s99

import org.specs2.mutable
import S99_P18.slice

class P18Spec extends mutable.Specification {
  "P18 solution" should {
    "Extract a slice from a list." in {
      val expected = slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      expected === List('d, 'e, 'f, 'g)
    }
  }
}