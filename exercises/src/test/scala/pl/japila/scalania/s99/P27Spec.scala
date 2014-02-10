package pl.japila.scalania.s99

import org.specs2.mutable._

class P27Spec extends Specification with ExamplesBlock {
  "P27a solution" should {
    "Group 9 elements of a set into disjoint subsets of 2, 3 and 4 elements." in {
      import S99_P27.solutions
      solutions[String]().foreach {
        case (solution, groupImpl) =>
          solution >> {
            val testspec = "Multinomial coefficients for multisets of 2,3 and 4 elements gives (2,3,4)!=(2+3+4)!/(2!3!4!) = 1260 possibilities"
            val input = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
            val output = groupImpl(input)
            output.distinct.length mustEqual 1260
            output.length mustEqual 1260
          }
      }
    }
  }
  "P27b solution" should {
    "Group 3 elements of a set into disjoint subsets of 2 and 1 elements. (generalized version)" in {
      import S99_P27.{ solutions3 => solutions }
      solutions[Int]().foreach {
        case (solution, group3Impl) =>
          solution >> {
            val inputGroups = List(2, 1)
            val inputElements = List.range(0, 3)
            val expected = List(List(List(0, 1), List(2)), List(List(0, 2), List(1)), List(List(1, 2), List(0)))
            group3Impl(inputGroups, inputElements) === expected
          }
      }
    }
  }
}