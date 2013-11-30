package pl.japila.scalania.s99

import org.specs2.mutable._
import pl.japila.scalania._

class P22Spec extends Specification with ExamplesBlock {
  "P22 solution" should {
    "Create a list containing all integers within a given range." in {
      import S99_P22.solutions
      solutions.map(s => (s"${solutionName(s)} solution", s)).foreach {
        case (solution, s) =>
          solution >> {
            val actual = s(4, 9)
            val expected = Seq(4, 5, 6, 7, 8, 9)
            actual must_== expected
          }
      }
    }
  }
}