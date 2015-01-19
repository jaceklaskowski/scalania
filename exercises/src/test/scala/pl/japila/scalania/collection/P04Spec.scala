package pl.japila.scalania.collection

import org.specs2.mutable.Specification
import P04.groupIndexed

class P04Spec extends Specification {
  "groupIndexed" should {
    "Group keys and use their values as indices." in {
      {
        val input = Seq(
          1 -> 2,
          1 -> 5,
          1 -> 3,
          2 -> 4,
          2 -> 3,
          2 -> 1
        )
        val expected = Map(
          1 -> Seq(0, 1, 1, 0, 1),
          2 -> Seq(1, 0, 1, 1)
        )
        groupIndexed(input) must_=== expected
      }
    }
  }

}
