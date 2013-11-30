package pl.japila.scalania.euler

import org.specs2.mutable._
import pl.japila.scalania._
import Euler_P01._

class P01Spec extends Specification with ExamplesBlock {
  "P01 solution" should {
    "Find the sum of all the multiples of 3 or 5 below 1000." in {
      solutions.map(s => (s"${solutionName(s)} solution", s)).foreach {
        case (solution, s) =>
          solution >> { s(3, 5, 1000) must_== 233168 }
      }
    }
  }
}
