package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P23.randomSelect

object P23Spec extends Specification {
  "P23 solution" should {
    "Extract a given number of randomly selected elements from a list." in {
      val input = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
      val output = randomSelect(3, input)
      output.distinct.size === 3
      output.forall(input.contains(_)) === true
    }
  }
}