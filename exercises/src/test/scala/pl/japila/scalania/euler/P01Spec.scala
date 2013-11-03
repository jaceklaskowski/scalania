package pl.japila.scalania.euler

import org.specs2.mutable._
import org.specs2.specification.Tables
import Euler_P01._

class P01Spec extends Specification with Tables with ExamplesBlock {
  "P01 solution" should {
    "Find the sum of all the multiples of 3 or 5 below 1000." >> {

      val titles = List("name", "function")
      val dr2s = List[DataRow2[String, (Int, Int, Int) => Int]]()
      val rows = solutions.foldLeft(dr2s) { (l, f) =>
        DataRow2(s"${f.getClass.getSimpleName} solution", f) :: l
      }

      val t2 = new Table2[String, (Int, Int, Int) => Int](titles, rows.reverse)
      t2.rows.foreach { row =>
        row.t1 >> { row.t2(3, 5, 1000) must_== 233168 }
      }
    }
  }
}
