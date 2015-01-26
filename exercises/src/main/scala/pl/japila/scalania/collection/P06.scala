package pl.japila.scalania.collection

/**
 * Inspired by http://stackoverflow.com/q/28134729/1305344
 */
 
 /** radek: tried to make it a true one-liner but guess I'm too slim in Scala for that :) */
 
object P06 {
  def isNumeric(as: Iterable[String]): Boolean = {var out:Boolean=true;x foreach ("""^\d*$""".r findFirstIn _ getOrElse {out=false});out}
}
