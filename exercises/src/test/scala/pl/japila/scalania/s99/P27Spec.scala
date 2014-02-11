package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P27.group3
import S99_P27.group

class P27Spec extends Specification {
  "P27a solution" should {
    "Group 9 elements of a set into disjoint subsets of 2, 3 and 4 elements." in {
      val testspec = "Multinomial coefficients for multisets of 2,3 and 4 elements gives (2,3,4)!=(2+3+4)!/(2!3!4!) = 1260 possibilities"
      val input = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
      val output = group3(input)
      output.distinct.length mustEqual 1260
      output.length mustEqual 1260
    }
  }
  "P27b solution" should {
    "Group 3 elements of a set into disjoint subsets of 2 and 1 elements. (generalized version)" in {
      def toNestedSet[T](tsss: Seq[Seq[Seq[T]]]): Set[Set[Set[T]]] =
        tsss.map(_.map(_.toSet).toSet).toSet

      val inputGroups = List(2, 1)
      val inputElements = List.range(0, 3)
      val expected = List(List(List(0, 1), List(2)), List(List(0, 2), List(1)), List(List(1, 2), List(0)))
      toNestedSet(group(inputGroups, inputElements)) === toNestedSet(expected)
    }
  }
}