package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P32._

class P32Spec extends Specification {
  "P32 solution" should {
    "Determine the greatest common divisor of two positive integer numbers." in {
      gcd(36, 63) === 9
    }
  }

}
