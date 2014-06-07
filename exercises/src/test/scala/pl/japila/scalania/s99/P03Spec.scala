package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P03.nth

class P03Spec extends Specification {
  "P03 solution" should {
    "Find the Kth element of a list." in {
      nth(-2, Nil) == None
      nth(-2, Seq(1, 2, 3)) == None
      nth(-1, Seq('a', 'b', 'c')) == None
      nth(2, Nil) == None
      nth(2, Seq(1)) == None
      nth(2, Seq(1, 1, 2, 3, 5, 8)) == Some(2)
    }
  }
}