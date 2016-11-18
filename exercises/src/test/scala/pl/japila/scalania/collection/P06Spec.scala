package pl.japila.scalania.collection

import org.scalacheck.Gen.{ alphaStr, listOf, nonEmptyListOf, numStr }
import pl.japila.scalania.collection.P06.isNumeric

import scala.util.Random

class P06Spec extends AbstractWordSpec {
  "isNumeric" should {
    "Check whether all elements in a sequence are numeric." in {
      val numericStringSeqGen = for {
        sequence <- listOf(numStr)
      } yield {
        sequence
      }
      forAll(numericStringSeqGen) {
        list =>
          isNumeric(list.toIterable) === true
      }

    }

    "Check whether at least one element in a sequence is not numeric." in {
      val atLeastOneNotNumericGen = for {
        stringList <- nonEmptyListOf(alphaStr)
        numList <- listOf(numStr)
      } yield {
        Random.shuffle(stringList ++ numList)
      }
      forAll(atLeastOneNotNumericGen) {
        list =>
          isNumeric(list.toIterable) === false
      }

    }
  }

}
