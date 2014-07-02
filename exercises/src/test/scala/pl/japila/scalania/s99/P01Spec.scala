package pl.japila.scalania.s99

import org.scalacheck.{ Prop, Gen }
import org.specs2.mutable._
import org.specs2.ScalaCheck
import S99_P01.last

class P01Spec extends Specification with ScalaCheck {
  "P01 solution" should {
    "Find the last element of a list" in {
      last(Nil) must beFailedTry.withThrowable[NoSuchElementException]
      last(Seq(1)) must beSuccessfulTry.withValue(1)
      last(Seq(1, 1, 2, 3, 5, 8)) must beSuccessfulTry.withValue(8)
    }

    val nonEmptySeqs = Gen.nonEmptyContainerOf[Seq, Int](Gen.choose(1, 100000))

    "Find the last element of a list (ScalaCheck)" ! Prop.forAll(nonEmptySeqs) { (ns: Seq[Int]) =>
      last(ns) must beSuccessfulTry.withValue(ns.last)
    }
  }
}