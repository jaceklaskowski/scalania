package pl.japila.scalania.s99

import org.specs2.mutable._

class P24Spec extends Specification with ExamplesBlock {
  "P24 solution" should {
    "Lotto: Draw N different random numbers from the set 1..M." in {
      import S99_P24._
      solutions.foreach {
        case (solution, lottoImpl) =>
          solution >> {
            val randomrange = lottoImpl(6, 49)
            randomrange.distinct.size === 6
            randomrange.forall(e => 1 <= e && e <= 49) === true
          }
      }
    }
  }
}