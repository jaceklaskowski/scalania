package pl.japila.scalania.collection

object P06 {
  def isNumeric(as: Iterable[String]): Boolean = as.forall(_.forall(_.isDigit))
  
  def isNumeric_1(as: Iterable[String]): Boolean = { as foreach ("""^\d*$""".r findFirstIn _ getOrElse { return false }); true }
}
