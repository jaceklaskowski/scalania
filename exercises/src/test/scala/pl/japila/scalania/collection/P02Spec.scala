package pl.japila.scalania.collection

import org.scalacheck.{ Prop, Gen }
import org.specs2._

class P02Spec extends mutable.Specification with ScalaCheck {
  val genKeys: Gen[String] =
    Gen.oneOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "O", "P", "Q", "R", "S", "T", "W", "U",
      "V", "W", "X", "Y", "X")
  val genMumbers = Gen.choose(-100, 20)

  def genMap: Gen[Map[String, List[Int]]] = for {
    keys <- Gen.nonEmptyListOf(genKeys)
    values <- Gen.listOfN[List[Int]](keys.size, Gen.nonEmptyListOf(genMumbers))
  } yield (keys zip values).toMap

  "P02 solution" should {
    "Test whether all elements in Lists in Map[String,List[Int]] hold negatives." in {
      import P02.checkNegatives

      val p1 = Prop.forAll(genMap) { input: Map[String, List[Int]] =>
        val output = checkNegatives(input)
        input.keys must_=== output.keys
        output.keys must contain((key: String) => output(key) must_=== (input(key).forall(_ < 0)))
      }
      check(p1)
    }
  }
}
