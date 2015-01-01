package pl.japila.scalania.collection

import org.specs2._

class P02Spec extends mutable.Specification {
  "P02 solution" should {
    "Test whether all elements in Lists in Map[String,List[Int]] hold negatives." in {
      import P02.checkNegatives
      val input = Map(
        "A" -> Seq(-1, -5, -8),
        "B" -> Seq(-10, 0, 5),
        "C" -> Seq(0),
        "D" -> Seq(99, 1000, 2015))
      checkNegatives(input) must_=== Map("A" -> true, "B" -> false, "C" -> false, "D" -> false)
    }
  }
}
