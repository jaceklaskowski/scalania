package pl.japila.scalania.s99

import org.specs2.mutable
import S99_P19.rotate

class P19Spec extends mutable.Specification {
  "P19 solution" should {
    " Rotate a list N places to the left." in {
      rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
      rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
      rotate(0, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    }
  }
}