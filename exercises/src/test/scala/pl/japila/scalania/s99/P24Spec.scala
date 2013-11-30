package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P24.lotto

class P24Spec extends Specification {
  "P24 solution" should {
    "Lotto: Draw N different random numbers from the set 1..M." in {
      val randomrange = lotto(6, 49)
      randomrange.distinct.size === 6
      randomrange.forall(e => 1 <= e && e <= 49) === true
    }
  }
}