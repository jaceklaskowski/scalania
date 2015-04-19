package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P31.IntWithIsPrime

object P31Spec extends Specification {

  "P31 solution" should {
    "Find actual primes" in {
      val primes = Seq(2, 5, 7, 13)
      primes.forall(dataPoint => {
        dataPoint.isPrime aka s"result for the actual prime $dataPoint" mustEqual true
      })
    }
    "Return false for composite numbers" in {
      val compositeNumbers = Seq(9, 10, 25, 100)
      compositeNumbers.forall(dataPoint => {
        dataPoint.isPrime aka s"result for the composite number $dataPoint" mustEqual false
      })
    }
    "Return false for numbers less than 2" in {
      val lessThanTwo = Seq(-100, -2, -1, 0, 1)
      lessThanTwo.forall(dataPoint => {
        dataPoint.isPrime aka s"result for the less-than-two number $dataPoint" mustEqual false
      })
    }
  }
}
