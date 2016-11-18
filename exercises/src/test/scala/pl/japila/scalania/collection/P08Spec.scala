package pl.japila.scalania.collection

import org.specs2.Specification

class P08Spec extends Specification {
  def is = s2"""
    P08 removes words from sentences $e1
  """

  def e1 = {
    val words = "game of thrones".split("\\s").toSet
    val sentences = Seq("thrones videos", "watch game", "game of thrones stuff")

    P08.removeWordsFromSentences(words)(sentences) must_== Seq("videos", "watch", "stuff")
  }

}
