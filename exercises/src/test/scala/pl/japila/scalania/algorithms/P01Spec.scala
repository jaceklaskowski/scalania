package pl.japila.scalania.algorithms

import org.specs2.mutable._
import pl.japila.scalania._
import P01._

class P01Spec extends Specification with ExamplesBlock {
  "P01 solution" should {
    "Answer whether given sites are connected" in {
      solutions.map {
        s => (s"${solutionName(s)} solution", s)
      }.foreach {
        case (solution, s) =>
          solution >> {
            s(1, 2, Seq(Link(1, 2)))
            s(1, 2, Seq(Link(1, 2), Link(1, 2)))
            s(1, 3, Seq(Link(1, 2), Link(2, 1), Link(1, 3), Link(2, 3)))
            s(1, 4, Seq(Link(1, 2), Link(3, 4))) must_== false
          }
      }
    }
  }

}
