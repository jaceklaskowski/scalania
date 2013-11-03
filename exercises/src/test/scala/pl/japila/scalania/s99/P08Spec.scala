package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P08.compress

class P08Spec extends Specification {
  "P08 solution" should {
    "Eliminate consecutive duplicates of list elements" in {
      compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List('a, 'b, 'c, 'a, 'd, 'e)
    }
    "Applied to an empty list return an empty list" in {
      compress(Nil) mustEqual Nil
    }
  }
}