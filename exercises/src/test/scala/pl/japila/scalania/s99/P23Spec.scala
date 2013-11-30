package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P23.solutions

class P23Spec extends Specification with ExamplesBlock {
  "P23 solution" should {
    "Extract a given number of randomly selected elements from a list." in {
      solutions[Symbol]().foreach {
        case (solution, randomSelectImpl) =>
          solution >> {
            val input = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
            val output = randomSelectImpl(3, input)
            output.distinct.size === 3
            output.forall(input.contains(_)) === true
          }
      }
    }
  }
}