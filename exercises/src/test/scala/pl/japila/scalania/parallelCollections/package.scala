package pl.japila.scalania

import scala.concurrent.duration._
import java.util.concurrent.TimeUnit
import scala.collection.parallel.{ ForkJoinTaskSupport, ParIterable, ParSeq }

package object parallelCollections {
  def avgTime(b: => Unit, repetitions: Int = 5): Duration = {
    val startTime = System.currentTimeMillis()
    (0 until repetitions).foreach {
      _ => b
    }
    Duration((System.currentTimeMillis() - startTime) / repetitions, TimeUnit.MILLISECONDS)
  }

  def setThreads[T](n: Int, col: ParSeq[T]): ParSeq[T] = {
    col.tasksupport = new ForkJoinTaskSupport(new scala.concurrent.forkjoin.ForkJoinPool(n))
    col
  }
}
