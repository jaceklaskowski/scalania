package pl.japila.scalania.collection

object P02 {
  /**
   * Inspired by http://stackoverflow.com/q/27689917/1305344
   *
   * FIXME Reference the method using scaladoc rules
   * http://www.scala-lang.org/api/current/index.html#scala.collection.Map@mapValues[C](f:B=>C):scala.collection.Map[A,C]
   * http://www.scala-lang.org/api/current/index.html#scala.collection.Seq@forall(p:A=>Boolean):Boolean
   *
   */
  def checkNegatives[T](m: Map[T, Seq[Int]]): Map[T, Boolean] = m.mapValues(_.forall(_ < 0))
}
