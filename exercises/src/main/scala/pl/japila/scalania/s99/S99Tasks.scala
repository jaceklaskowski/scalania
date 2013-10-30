package pl.japila.scalania.s99

import annotation.tailrec

trait S99TasksSolution {
  def p21[T](toAdd: T, position: Int, list: Seq[T]): Seq[T]
  def p22(from: Int, to: Int): Seq[Int]
  def p23[T](sel: Int, list: Seq[T]): Seq[T]
  def p24(from: Int, to: Int): Seq[Int]
  def p25[T](list: Seq[T]): Seq[T]
  def p26[T](combined: Int, list: Seq[T]): Seq[Seq[T]]
  def p27[T](list: Seq[T]): Seq[Seq[Seq[T]]]
  def p27b[T](groups: Seq[Int], list: Seq[T]): Seq[Seq[Seq[T]]]
  def p28[T](list: Seq[Seq[T]]): Seq[Seq[T]]
}

class S99TasksSolutionNotImplemented extends S99TasksSolution {

  def p21[T](toAdd: T, position: Int, list: Seq[T]): Seq[T] = ???

  def p22(from: Int, to: Int): Seq[Int] = ???

  def p23[T](sel: Int, list: Seq[T]): Seq[T] = ???

  def p24(from: Int, to: Int): Seq[Int] = ???

  def p25[T](list: Seq[T]): Seq[T] = ???

  def p26[T](combined: Int, list: Seq[T]): Seq[Seq[T]] = ???

  def p27[T](list: Seq[T]): Seq[Seq[Seq[T]]] = ???

  def p27b[T](groups: Seq[Int], list: Seq[T]): Seq[Seq[Seq[T]]] = ???

  def p28[T](list: Seq[Seq[T]]): Seq[Seq[T]] = ???

}
