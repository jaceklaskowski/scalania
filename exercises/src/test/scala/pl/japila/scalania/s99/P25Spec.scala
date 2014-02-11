package pl.japila.scalania.s99

import org.specs2.mutable._

class P25Spec extends Specification with ExamplesBlock {
  "P25 solution" should {
    "Generate a random permutation of the elements of a list." in {
      import S99_P25.{ testSolutions => solutions }
      solutions[Symbol]().foreach {
        case (solution, randomPermuteImpl) =>
          solution >> {
            val input = List('a, 'b, 'c, 'd, 'e, 'f)
            val randomPer = randomPermuteImpl(input)
            randomPer.intersect(input) === input
            randomPer.diff(input).size === 0
          }
      }
    }
  }
}