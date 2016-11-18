package pl.japila.scalania.collection

import pl.japila.scalania.collection.P05._
import org.scalacheck.Gen._
import org.scalacheck.{ Gen, Prop }
import org.specs2.{ ScalaCheck, mutable }

class P05Spec extends mutable.Specification with ScalaCheck {

  def checkRepetition(ns: List[Int]): Boolean =
    ns.tail.foldLeft((ns.head, true))((a, b) => (b, a._1 != b && a._2))._2

  def differentListSize(ns: List[Int]): Gen[List[Int]] = {
    val MIN = 1
    val MAX = 3
    for {
      listSize <- choose(MIN, MAX)
      list <- listOfN(listSize, ns.head)
    } yield list
  }

  "groupWhen" should {
    "Consume elements in a collection until a condition is met." in {
      {
        val MIN = 2
        val MAX = 5
        val listGenerator = for {
          listSize <- choose(MIN, MAX)
          listOfInts <- listOfN(listSize, choose(1, 10)) suchThat (checkRepetition(_))
          listOfListOfInts <- listOfInts.map(List(_)).map(differentListSize(_).sample.get)
        } yield listOfListOfInts
        check {
          Prop.forAll(listGenerator) { list =>
            groupWhen[Int](list.flatten.iterator)(_ == _).toList must_== list.filter(_.size > 1)
          }
        }
      }
    }
  }
  "Consume elements in a collection until a condition is met, even if there is one element." in {
    {
      val it = List(1).iterator
      val expected = List()
      groupWhen(it)(_ == _).toList must_== expected
    }
  }
}
