package pl.japila.scalania.collection

import org.specs2.mutable.Specification
import P06.isNumeric

class P06Spec extends Specification {
  "isNumeric" should {
    "Check whether all elements in a sequence are numeric." in {
      {
        val it = List("sdkfj", "7", "2", "5", "3", "1", "9", "2", "1", "4").toIterable
        isNumeric(it) must beFalse
      }
      {
        val it = List("7", "2", "5", "3", "1", "9", "2", "1", "4").toIterable
        isNumeric(it) must beTrue
      }
    }
  }

}
