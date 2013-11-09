package pl.japila.scalania.euler

object Euler_P01 {
  val solutions = List[(Int, Int, Int) => Int](
    findSumOfMultiplies
  )

  def findSumOfMultiplies(a: Int = 3, b: Int = 5, limit: Int = 1000): Int =
    (0 until limit).filter(n => n % a == 0 || n % b == 0).sum

}
