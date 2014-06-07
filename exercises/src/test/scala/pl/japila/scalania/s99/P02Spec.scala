package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P02.penultimate

class P02Spec extends Specification {
  "P02 solution" should {
    "Find the last but one element of a list." in {
      penultimate(Seq(1, 1, 2, 3, 5, 8)) == Some(5)
      penultimate(Nil) == None
      penultimate(Seq(1)) == None
    }
  }
}