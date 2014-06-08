package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P09.pack

class P09Spec extends Specification {
  "P09 solution" should {
    "Pack consecutive duplicates of list elements into sublists." in {
      val actual = pack(Seq('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      val expected = Seq(Seq('a, 'a, 'a, 'a), Seq('b), Seq('c, 'c), Seq('a, 'a), Seq('d), Seq('e, 'e, 'e, 'e))
      actual === expected
    }
    "Applied to an empty list return an empty list" in {
      pack(Nil) mustEqual Nil
    }
    "Pack duplicates in a all-same-element list" in {
      pack(Seq(1, 1, 1)) mustEqual Seq(Seq(1, 1, 1))
    }
  }
}