package pl.japila.scalania.s99

import org.specs2.mutable
import S99_P23.randomSelect

class P23Spec extends mutable.Specification {
  "P23 solution" should {
    "Extract a given number of randomly selected elements from a list." in {
      val input = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
      val output = randomSelect(3, input)
      output.distinct.size === 3
      output.forall(input.contains(_)) === true
    }
  }
}