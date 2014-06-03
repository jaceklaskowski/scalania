package pl.japila.scalania.parallelCollections

import scala.util.Random
import scala.concurrent.duration.Duration
import org.scalatest.{ WordSpec, ShouldMatchers }
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import scala.collection.parallel.ParSeq

@RunWith(classOf[JUnitRunner])
class Ex2P12DecodeSeqSpecification extends WordSpec with ShouldMatchers {
  val random = new Random

  import Ex2P12DecodeSeq._

  "Decode seq" should {
    "work correctly" in {
      decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should be
      List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

      decode(ParSeq((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should be
      ParSeq('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    }

    val someSymbols = Array('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h)
    val longListSeq = List.fill(1000000)((random.nextInt(10), someSymbols(random.nextInt(8))))
    val longListPar = longListSeq.par

    "be better working in parallel" in {
      val seqTime = avgTime(decode(longListSeq))
      val parTime = avgTime(decode(longListPar))
      println(s"List of 1000000 elements\n\tSequential time: ${seqTime}\n\tParallel time: ${parTime}")
      seqTime should be > parTime
    }

    "have good speed-up" in {
      val maxThreads = 4
      val parLists = Array.tabulate(maxThreads)(n => setThreads(n + 1, longListPar))
      val seqTime = avgTime(decode(longListSeq))

      val times = Array.tabulate[Duration](maxThreads)(n => avgTime(decode(parLists(n))))
      println(s"Threads\t\t1\t2\t3\t4")
      println(s"Times:\t\t" + times.mkString("\t") + "\n")
      println(s"Speed-up\t\t" + times.map(x => seqTime / x).mkString("\t") + "\n")

      true should be(true)
    }
  }
}

