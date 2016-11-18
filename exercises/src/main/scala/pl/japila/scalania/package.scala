package pl.japila

package object scalania {

  def solutionName(s: Any): String =
    s.getClass.getSimpleName.split("\\$").drop(1).dropRight(1).mkString("_")
}
