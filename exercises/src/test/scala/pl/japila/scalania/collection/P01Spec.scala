package pl.japila.scalania.collection

import org.specs2._

class P01Spec extends mutable.Specification {
  "P01 solution" should {
    "Select all elements of collection that do not satisfy a predicate." in {
      import P01.filterNot
      filterNot((0 to 5), (2 to 7).toSet) must_=== Seq(0, 1)
    }
  }
}
