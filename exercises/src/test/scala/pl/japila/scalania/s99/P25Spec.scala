package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P25.randomPermute

object P25Spec extends Specification {
  "P25 solution" should {
    "Generate a random permutation of the elements of a list." in {
      val input = List('a, 'b, 'c, 'd, 'e, 'f)
      val randomPer = randomPermute(input)
      randomPer.intersect(input) === input
      randomPer.diff(input).size === 0
    }
  }
}