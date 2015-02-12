package pl.japila.scalania.collection

import org.specs2.mutable.Specification
import P05.groupWhen
import org.specs2.mutable.Specification

class P05Spec extends Specification {
  "groupWhen" should {
    "Consume elements in a collection until a condition is met." in {
      {
        val it = List(1, 1, 1, 1, 3, 4, 3, 2, 2, 2).iterator
        val expected = List(List(1, 1, 1, 1), List(2, 2, 2))
        groupWhen(it)(_ == _).toSeq must_=== expected
      }
    }
    "Consume elements in a collection until a condition is met, even if the last element isn't repeated." in {
      {
        val it = List(1, 1, 1, 1, 2, 2, 2, 1).iterator
        val expected = Seq(List(1, 1, 1, 1), List(2, 2, 2))
        groupWhen(it)(_ == _).toSeq must_=== expected
      }
    }
    "Consume elements in a collection until a condition is met, even if there is one element." in {
      {
        val it = List(1).iterator
        val expected = Seq()
        groupWhen(it)(_ == _).toSeq must_=== expected
      }
    }
    "Consume elements in a collection until a condition is met, even if there is no repeated elements." in {
      {
        val it = List(1, 2, 3).iterator
        val expected = Seq()
        groupWhen(it)(_ == _).toSeq must_=== expected
      }
    }
  }
}
