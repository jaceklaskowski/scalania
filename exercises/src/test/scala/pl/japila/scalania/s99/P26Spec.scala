package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P26.combinations

class P26Spec extends Specification {
  "P26 solution" should {
    "Generate the combinations of 3 distinct objects, chosen from a 4 element list." in {
      val input = List('a, 'b, 'c, 'd)
      val expected = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'c, 'd), List('b, 'c, 'd))
      combinations(3, input).toSet === expected.toSet
    }
    "Generate all the combinations of a committee of 3, chosen from a group of 12 people." in {
      val testspec = "We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficient). " +
        "For pure mathematicians, this result may be great. But we want to really generate all the possibilities. "
      val input = List.range(0, 12)
      val output = combinations(3, input)
      output.length === 220
      output.distinct.length === 220
    }
  }
}