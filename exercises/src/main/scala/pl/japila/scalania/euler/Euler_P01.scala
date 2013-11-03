package pl.japila.scalania.euler

import org.specs2.specification.Tables

object Euler_P01 extends Tables {
  val solutions = List[(Int, Int, Int) => Int](
    findSumOfMultiplies,
    findSumOfMultiplies_jl
  )

  val solutions2 =
    "name" | "function" |
      "first solution" ! findSumOfMultiplies |
      "jl's solution" ! findSumOfMultiplies_jl |
      "eric's solution" ! findSumOfMultiplies_eric

  def findSumOfMultiplies: (Int, Int, Int) => Int = (a: Int, b: Int, limit: Int) => ???
  def findSumOfMultiplies_jl: (Int, Int, Int) => Int = (a: Int, b: Int, limit: Int) => ???

  def findSumOfMultiplies_eric = (a: Int, b: Int, limit: Int) =>
    (0 until limit).filter(n => n % a == 0 || n % b == 0).sum

}
