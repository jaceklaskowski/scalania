package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P03.nth

object P03Spec extends Specification {
  "P03 solution" should {
    "Find the Kth element of a list." in {
      nth(-2, Nil) must beNone
      nth(-2, Seq(1, 2, 3)) must beNone
      nth(-1, Seq('a', 'b', 'c')) must beNone
      nth(2, Nil) must beNone
      nth(2, Seq(1)) must beNone
      nth(2, Seq(1, 1, 55, 3, 5, 8)) must beSome(55)
    }
  }
}