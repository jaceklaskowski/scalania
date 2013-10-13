package pl.japila.s99

object P03 {
  def nth[A](n: Int, l: List[A]): A = (n, l) match {
    case (0, h :: _) => h
    case (n, _ :: tail) => nth(n - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }
}
