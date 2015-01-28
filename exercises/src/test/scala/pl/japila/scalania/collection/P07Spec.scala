package pl.japila.scalania.collection

import org.scalacheck.Prop
import org.specs2.{ ScalaCheck, mutable }
import org.scalacheck.Gen.{ choose, listOfN }
import P07.sumOfPrecedingElements

class P07Spec extends mutable.Specification with ScalaCheck {

  def subtractionOfFollowingElements(ns: Seq[Int]): Seq[Int] = {
    ns match {
      case Seq() => ns
      case elem :: Nil => elem +: subtractionOfFollowingElements(Nil)
      case head :: tail => (head - tail.head) +: subtractionOfFollowingElements(tail)
    }
  }

  "sumOfPrecedingElements" should {
    "Sum all preceding elements in a collection." in {
      {
        val MIN = 1
        val MAX = 10
        val seqGenerator = for {
          seqSize <- choose(MIN, MAX)
          sequences <- listOfN(seqSize, choose(1, 10))
        } yield {
          sequences
        }
        val p1 = Prop.forAll(seqGenerator) {
          seq => subtractionOfFollowingElements(sumOfPrecedingElements(seq).reverse).reverse must_=== seq
        }
        check(p1)
      }
    }
  }
}
