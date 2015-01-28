package pl.japila.scalania.collection

import org.specs2.mutable.Specification
import P07.sumOfPrecedingElements

class P07Spec extends Specification {
  "sumOfPrecedingElements" should {
    "Sum all preceding elements in a collection." in {
      {
        val ns = Seq(1, 3, 4, 5, 2, 4)
        sumOfPrecedingElements(ns) must_=== Seq(1, 4, 8, 13, 15, 19)
      }
    }
  }
}
