package pl.japila.scalania.parallelCollections

import scala.util.Random
import org.scalatest.{ ShouldMatchers, WordSpec }
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import scala.concurrent.duration.Duration

@RunWith(classOf[JUnitRunner])
class WarmUpSpecification extends WordSpec with ShouldMatchers {
  val random = new Random

  import WarmUp._

  "Simple adder" should {
    "add 1" in {
      add1Seq(List(1, 2, 3)) should be(List(2, 3, 4))

      add1Par(List(1, 2, 3)) should be(List(2, 3, 4))
    }
    val longList = List.fill(5000000)(random.nextInt())

    "be better working in parallel" in {
      val seqTime = avgTime(add1Seq(longList))
      val parTime = avgTime(add1Par(longList))
      println(s"List of 5000000 elements\n\tSequential time: ${seqTime}\n\tParallel time: ${parTime}")
      seqTime should be > parTime
    }

    "have good speed-up" in {
      val maxThreads = 4
      val parList = longList.par
      val parLists = Array.tabulate(maxThreads)(n => setThreads(n + 1, parList))
      val parListSeq = longList
      val seqTime = avgTime(add1Seq(parListSeq))

      val times = Array.tabulate[Duration](maxThreads)(n => avgTime(add1Par(parLists(n))))
      println(s"Threads\t\t1\t2\t3\t4")
      println(s"Times:\t\t" + times.mkString("\t") + "\n")
      println(s"Speed-up\t\t" + times.map(x => seqTime / x).mkString("\t") + "\n")

      true should be(true)
    }
  }
}
