package pl.japila.scalania.euler

object Euler_P01 {

  val solutions = List[(Int, Int, Int) => Int](
    findSumOfMultiplies,
    findSumOfMultiplies_jl,
    findSumOfMultiplies_eric
  )

  def findSumOfMultiplies: (Int, Int, Int) => Int = (a: Int, b: Int, limit: Int) => ???

  def findSumOfMultiplies_jl: (Int, Int, Int) => Int = (a: Int, b: Int, limit: Int) => ???

  def findSumOfMultiplies_eric = (a: Int, b: Int, limit: Int) =>
    (0 until limit).filter(n => n % a == 0 || n % b == 0).sum

}
