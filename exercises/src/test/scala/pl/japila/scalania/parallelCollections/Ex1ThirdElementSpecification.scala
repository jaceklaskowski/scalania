package pl.japila.scalania.parallelCollections

import scala.util.Random
import scala.concurrent.duration.Duration
import org.scalatest.{ WordSpec, ShouldMatchers }
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import scala.collection.parallel.ParSeq

@RunWith(classOf[JUnitRunner])
class Ex1ThirdElementSpecification extends WordSpec with ShouldMatchers {
  val random = new Random

  import Ex1ThirdElement._

  "Third element" should {
    "work correctly" in {
      third(List(1, 2, 3, 3, 4)) should be(2)

      third(ParSeq(1, 2, 3, 3, 5)) should be(2)
    }

    val longListSeq = List.fill(5000000)(random.nextInt())
    val longListPar = longListSeq.par

    "be better working in parallel" in {
      val seqTime = avgTime(third(longListSeq))
      val parTime = avgTime(third(longListPar))
      println(s"List of 5000000 elements\n\tSequential time: ${seqTime}\n\tParallel time: ${parTime}")
      seqTime should be > parTime
    }

    "have good speed-up" in {
      val maxThreads = 4
      val parLists = Array.tabulate(maxThreads)(n => setThreads(n + 1, longListPar))
      val seqTime = avgTime(third(longListSeq))

      val times = Array.tabulate[Duration](maxThreads)(n => avgTime(third(parLists(n))))
      println(s"Threads\t\t1\t2\t3\t4")
      println(s"Times:\t\t" + times.mkString("\t") + "\n")
      println(s"Speed-up\t\t" + times.map(x => seqTime / x).mkString("\t") + "\n")

      true should be(true)
    }
  }
}
