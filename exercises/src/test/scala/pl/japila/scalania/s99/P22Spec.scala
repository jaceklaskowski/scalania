package pl.japila.scalania.s99

import org.specs2._

object P22Spec extends mutable.Specification with mutable.ExamplesBlock {
  "P22 solution" should {
    "Create a list containing all integers within a given range." in {
      import S99_P22._
      solutions.foreach {
        case (solution, rangeImpl) =>
          solution >> {
            val actual = rangeImpl(4, 9)
            val expected = Seq(4, 5, 6, 7, 8, 9)
            actual must_== expected
          }
      }
    }
  }
}