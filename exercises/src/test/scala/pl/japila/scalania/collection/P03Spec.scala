package pl.japila.scalania.collection

import org.specs2._

class P03Spec extends mutable.Specification {
  "P03 solution" should {
    "Split string using separator including trailing empty strings." in {
      import P03.split
      {
        val input = "elem1, elem2,,"
        split(input, ",") must_=== Array("elem1", " elem2", "", "")
      }
      {
        val input = ","
        split(input, ",") must_=== Array("", "")
      }
    }
  }
}
