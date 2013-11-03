package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P21.insertAt

class P21Spec extends Specification {
  "P21 solution" should {
    "Insert an element at a given position into a list." in {
      insertAt('new, 1, List('a, 'b, 'c, 'd)) === List('a, 'new, 'b, 'c, 'd)
    }
  }
}