package pl.japila.scalania.collection

object P01 {
  /**
   * FIXME Reference the method using scaladoc rules
   * http://www.scala-lang.org/api/current/index.html#scala.collection.Seq@filterNot(p:A=>Boolean):Repr
   */
  def filterNot[T](ts: Seq[T], p: T => Boolean): Seq[T] = for { t <- ts if(!p(t))} yield t

  def filterNot1[T](ts: Seq[T], p: T => Boolean): Seq[T] = ts.filter(!p.apply(_))

  def filter[T](ts: Seq[T], p: T => Boolean): Seq[T] = {
    ts match {
      case Seq() => Seq()
      case x +: xy =>
        if (!p.apply(x))
          filter(xy, p)
        else
          x +: filter(xy, p)
    }
  }

  def filterNot2[T](ts: Seq[T], p: T => Boolean): Seq[T] = filter(ts, (t: T) => !p.apply(t))
}
