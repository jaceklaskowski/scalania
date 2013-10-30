package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P19.rotate

class P19Spec extends Specification {
  "P19 solution" should {
    "Rotate a list 3 places to the left." in {
      val actual = rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual === List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    }
    "Rotate a list 2 places to the right." in {
      val actual = rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual === List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
    }
    "Rotate a list 0 places to the left." in {
      val actual = rotate(0, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual === List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    }
    "Rotate a 2-element list 100 places to the left." in {
      val actual = rotate(100, List('a, 'b))
      actual === List('a, 'b)
    }
    "Rotate a 0-element list 3 places to the right." in {
      val actual = rotate(-3, List())
      actual === List()
    }
  }
}