package pl.japila.scalania.collection

import org.scalacheck.Gen
import org.scalatest.{ WordSpec, Matchers }
import org.scalatest.prop.PropertyChecks
import P01.filterNot

class P01Spec extends WordSpec with Matchers with PropertyChecks {

  "filterNot" when {
    val truePredicate = (a: Int) => true
    val falsePredicate = (a: Int) => false
    val parityPredicate = (a: Int) => a % 2 == 0
    val testCases =
      Table(
        ("source",        "predicate",      "expectedResult"),
        (Seq.empty[Int],  truePredicate,    Seq.empty[Int]),
        (0 to 2,          falsePredicate,   0 to 2),
        (0 to 2,          truePredicate,    Seq.empty[Int]),
        (0 to 7,          (2 to 7).toSet,   0 to 1),
        (0 to 7,          parityPredicate,  Seq(1,3,5,7))
      )

    "applied to source sequence and a predicate" should {
      "be equal to the expected result" in {
        forAll(testCases) {
          (source: Seq[Int], predicate: Int => Boolean, expectedResult: Seq[Int]) => {
            filterNot(source, predicate) should be(expectedResult)
          }
        }
      }
    }

    val TEST_RANGE = 100
    val testSeqs = for (
      x <- Gen.choose(-TEST_RANGE, TEST_RANGE);
      y <- Gen.choose(-TEST_RANGE, TEST_RANGE)
    ) yield {
      if (x < y) x to y else y to x
    }

    "applied to a random sequence with a predicate being another sequence" should {
      "be equal to first sequence minus second sequence" in {
        forAll(testSeqs, testSeqs) {
          (source: Seq[Int], filter: Seq[Int]) => {
            filterNot(source, filter.toSet) should be(source.filterNot(filter.toSet))
          }
        }
      }
    }
  }

}
