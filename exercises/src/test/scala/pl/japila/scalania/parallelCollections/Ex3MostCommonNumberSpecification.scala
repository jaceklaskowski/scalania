package pl.japila.scalania.parallelCollections
import scala.util.Random
import scala.concurrent.duration.Duration
import org.scalatest.{ WordSpec, ShouldMatchers }
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import scala.collection.parallel.ParSeq

@RunWith(classOf[JUnitRunner])
class Ex3MostCommonNumberSpecification extends WordSpec with ShouldMatchers {
  val random = new Random

  import Ex3MostCommonNumber._

  "Most common element" should {
    "work correctly" in {
      mostCommon(List(1, 2, 3, 3, 4)) should be(3)

      mostCommon(ParSeq(1, 2, 3, 3, 5)) should be(3)
    }

    val longListSeq = List.fill(5000000)((random.nextGaussian() * 1000).toInt)
    val longListPar = longListSeq.par

    "be better working in parallel" in {
      val seqTime = avgTime(mostCommon(longListSeq))
      val parTime = avgTime(mostCommon(longListPar))
      println(s"List of 5000000 elements\n\tSequential time: ${seqTime}\n\tParallel time: ${parTime}")
      seqTime should be > parTime
    }

    "have good speed-up" in {
      val maxThreads = 4
      val parLists = Array.tabulate(maxThreads)(n => setThreads(n + 1, longListPar))
      val seqTime = avgTime(mostCommon(longListSeq))

      val times = Array.tabulate[Duration](maxThreads)(n => avgTime(mostCommon(parLists(n))))
      println(s"Threads\t\t1\t2\t3\t4")
      println(s"Times:\t\t" + times.mkString("\t") + "\n")
      println(s"Speed-up\t\t" + times.map(x => seqTime / x).mkString("\t") + "\n")

      true should be(true)
    }
  }
}
