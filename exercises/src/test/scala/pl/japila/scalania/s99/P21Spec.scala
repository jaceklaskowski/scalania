package pl.japila.scalania.s99

import org.specs2.mutable._
import pl.japila.scalania._
//Fix the import standard
import S99_P21._

object P21Spec extends Specification with ExamplesBlock {
  "P21 solution" should {
    "Insert an element at a given position into a list." in {

      solutions.foreach {
        case (solution, insertAtImpl) =>
          solution >> {
            val actual = insertAtImpl('new, 1, Seq('a, 'b, 'c, 'd))
            val expected = Seq('a, 'new, 'b, 'c, 'd)
            actual === expected
          }
      }
    }
  }
}