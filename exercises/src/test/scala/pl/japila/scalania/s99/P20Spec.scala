package pl.japila.scalania.s99

import org.specs2.mutable._
import pl.japila.scalania._

class P20Spec extends Specification with ExamplesBlock {
  "P20 solution" should {
    "Remove the Kth element from a list." in {
      import S99_P20.solutions
      solutions.map(s => (s"${solutionName(s)} solution", s)).foreach {
        case (solution, s) =>
          solution >> {
            val (ts, t) = s(1, Seq('a, 'b, 'c, 'd))
            ts === Seq('a, 'c, 'd)
            t must_== 'b
          }
      }
    }
  }
}