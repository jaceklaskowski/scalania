package pl.japila.scalania.collection

object P06 {
  def isNumeric(as: Iterable[String]): Boolean = as.forall(_.forall(_.isDigit))
}
