package pl.japila.scalania.rxscala

import org.specs2.mutable._
import P01._

class P01Spec extends Specification with ExamplesBlock {
  "P01 solution" should {
    "Find the sum of all the multiples of 3 or 5 below 1000." in {
      solutions.map(s => (s"${solutionName(s)} solution", s)).foreach {
        case (solution, s) =>
          solution >> { s(3, 5, 1000) must_== 233168 }
      }
    }
  }

  def solutionName(s: Any) = s.getClass.getSimpleName.split("\\$").drop(1).dropRight(1).mkString("_")
}
