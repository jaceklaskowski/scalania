package pl.japila.scalania.s99

import org.specs2.mutable
import S99_P19.rotate

class P19Spec extends mutable.Specification {
  "P19 solution" should {
    "Rotate a list N places to the left." in {
      {
        val expected = rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
        expected === List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
      }
      {
        val expected = rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
        expected === List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
      }
    }
  }
}