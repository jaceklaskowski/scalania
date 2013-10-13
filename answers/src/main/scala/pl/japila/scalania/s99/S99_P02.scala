package pl.japila.scalania.s99

object S99_P02 {
  def penultimate[A](l: List[A]): A = l.reverse.tail.head
}
