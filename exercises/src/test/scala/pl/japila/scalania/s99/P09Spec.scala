package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P09.pack

class P09Spec extends Specification {
  "P09 solution" should {
    "Pack consecutive duplicates of list elements into sublists." in {
      val actual = pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      val expected = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
      actual === expected
    }
    "Applied to an empty list return an empty list" in {
      pack(Nil) mustEqual Nil
    }
  }
}