package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P16.drop

object P16Spec extends Specification {
  "P16 solution" should {
    "Drop every Nth element from a list." in {
      val expected = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
      val actual = drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual === expected
    }
  }
}