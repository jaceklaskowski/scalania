package pl.japila.scalania.euler

object Euler_P01 {
  val solutions = List[(Int, Int, Int) => Int](
    findSumOfMultiplies,
    findSumOfMultiplies_jl
  )

  def findSumOfMultiplies(a: Int = 3, b: Int = 5, limit: Int = 1000): Int = ???

  def findSumOfMultiplies_jl(a: Int = 3, b: Int = 5, limit: Int = 1000): Int = ???
}
