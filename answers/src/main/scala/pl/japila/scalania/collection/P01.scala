package pl.japila.scalania.collection

object P01 {
  /**
   * FIXME Reference the method using scaladoc rules
   * http://www.scala-lang.org/api/current/index.html#scala.collection.Seq@filterNot(p:A=>Boolean):Repr
   */
  def filterNot[T](ts: Seq[T], p: T => Boolean): Seq[T] = ts.filterNot(p)
}
