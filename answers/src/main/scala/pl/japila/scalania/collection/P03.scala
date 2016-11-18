package pl.japila.scalania.collection

object P03 {
  /**
   * Inspired by http://stackoverflow.com/q/27689065/1305344
   *
   * See http://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String,%20int)
   */
  def split(s: String, separator: String): Array[String] = s.split(separator, -1)
}
