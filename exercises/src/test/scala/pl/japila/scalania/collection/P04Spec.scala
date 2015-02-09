package pl.japila.scalania.collection

import org.scalacheck.Gen.{choose, listOfN, oneOf}
import pl.japila.scalania.collection.P04.groupIndexed

class P04Spec extends AbstractWordSpec {

  val MIN = 1
  val MAX = 15

  "groupIndexed" should {
    "Group keys and use their values as indices." in {
      {
        val mapGenerator = for {
          keyCount <- choose(MIN, MAX)
          seqSize <- choose(MIN, MAX)
          sequences <- listOfN(keyCount, listOfN(seqSize, oneOf(0, 1)))
        } yield {
          (1 to keyCount).zip(sequences).toMap
        }

        forAll(mapGenerator) {
          map =>
            val inputSeq = encode(map)
            val grouped = groupIndexed(inputSeq)
            assert(grouped.forall {
              case (k, v) =>
                val mapValues = map.getOrElse(k, Seq())
                v.reverse.dropWhile(_ == 0) == mapValues.reverse.dropWhile(_ == 0)
            })
        }
      }
    }
  }

  def encode(map: Map[Int, List[Int]]): Seq[(Int, Int)] = map.toSeq.flatMap {
    case (k, seq) =>
      val row = seq.zipWithIndex.flatMap {
        case (v, i) => if (v == 1) {
          Some(i + 1) // 1 - based
        } else {
          None
        }
      }
      row.map(i => (k, i))
  }

}
