package pl.japila.scalania.euler

import org.specs2.mutable
import Euler_P01.findSumOfMultiplies

class P01Spec extends mutable.Specification {
  "P01 solution" should {
    "Find the sum of all the multiples of 3 or 5 below 1000." in {
      findSumOfMultiplies(3, 5, 1000) == 233168
    }
  }
}