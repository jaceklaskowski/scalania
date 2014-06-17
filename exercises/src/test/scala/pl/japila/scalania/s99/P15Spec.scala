package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P15.duplicateN

object P15Spec extends Specification {
  "P15 solution" should {
    "Duplicate the elements of a list a given number of times." in {
      val expected = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
      val actual = duplicateN(3, List('a, 'b, 'c, 'c, 'd))
      actual === expected
    }
  }
}