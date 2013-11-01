package pl.japila.scalania.euler

import org.specs2.mutable._
import Euler_P01.solutions

class P01Spec extends Specification {
  "P01 solution" should {
    "Find the sum of all the multiples of 3 or 5 below 1000." in {
      solutions.forall { f => f(3, 5, 1000) === 233168 }
    }
  }
}
