package pl.japila.scalania.s99

import org.specs2.mutable
import S99_P14.duplicate

class P14Spec extends mutable.Specification {
  "P14 solution" should {
    "Duplicate the elements of a list." in {
      duplicate(List('a, 'b, 'c, 'c, 'd)) === List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    }
  }
}