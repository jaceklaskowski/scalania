package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P28.lsort
import S99_P28.lsortFreq

class P28Spec extends Specification {
  "P28a solution" should {
    "Sort a list of lists according to length of sublists." in {
      lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))) === List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))
    }
  }
  "P28b solution" should {
    "Sort lists according to their length frequency" in {
      val actual = lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
      val expected = List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))
      actual === expected
    }
  }
}