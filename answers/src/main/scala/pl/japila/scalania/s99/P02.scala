package pl.japila.s99

object P02 {
  def penultimate[A](l: List[A]): A = l.reverse.tail.head
}
