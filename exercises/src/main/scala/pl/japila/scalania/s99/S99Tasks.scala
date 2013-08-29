package pl.japila.scalania.s99

import annotation.tailrec

object S99Tasks {

}

trait S99TasksSolution {
  def p1[T](list : Seq[T]) : T
  def p2[T](list : Seq[T]) : T
  def p3[T](k: Int, l: Seq[T]) : T
  def p4(list : Seq[_]) : Int
  def p5[T](list : Seq[T]) : Seq[T]
  def p6[T](list : Seq[T]) : Boolean
  def p7[T](list : Seq[Any]) : Seq[T]
  def p8[T](list : Seq[T]) : Seq[T]
  def p9[T](list : Seq[T]) : Seq[Seq[T]]
  def p10[T](list : Seq[T]) : Seq[(Int,T)]
  def p11[T](list : Seq[T]) : Seq[Either[(Int,T),T]]
  def p12[T](list : Seq[(Int,T)]) : Seq[T]
  def p13[T](list : Seq[T]) : Seq[(Int,T)]
  def p14[T](list : Seq[T]) : Seq[T]
  def p15[T](nr: Int, list : Seq[T]) : Seq[T]
  def p16[T](nr: Int, list : Seq[T]) : Seq[T]
  def p17[T](nr: Int, list : Seq[T]) : (Seq[T],Seq[T])
  def p18[T](from: Int,to: Int, list : Seq[T]) : Seq[T]
  def p19[T](nr: Int, list : Seq[T]) : Seq[T]
  def p20[T](nr: Int, list : Seq[T]) : (Seq[T],T)
  def p21[T](toAdd: T, position: Int, list : Seq[T]) : Seq[T]
  def p22(from:Int, to:Int): Seq[Int]
  def p23[T](sel:Int, list: Seq[T]): Seq[T]
  def p24(from:Int, to:Int): Seq[Int]
  def p25[T](list : Seq[T]) : Seq[T]
  def p26[T](combined:Int, list : Seq[T]) : Seq[Seq[T]]
  def p27[T](list : Seq[T]) : Seq[Seq[Seq[T]]]
  def p28[T](list : Seq[Seq[T]]) : Seq[Seq[T]]
}

class S99TasksSolutionNotImplemented extends S99TasksSolution {
  def p1[T](list: Seq[T]): T = ???
  
  def p2[T](list: Seq[T]): T = ???

  def p3[T](k: Int, l: Seq[T]): T = ???

  def p4(list: Seq[_]): Int = ???

  def p5[T](list: Seq[T]): Seq[T] = ???

  def p6[T](list: Seq[T]): Boolean = ???

  def p7[T](list: Seq[Any]): Seq[T] = ???

  def p8[T](list: Seq[T]): Seq[T] = ???

  def p9[T](list: Seq[T]): Seq[Seq[T]] = ???

  def p10[T](list: Seq[T]): Seq[(Int, T)] = ???

  def p11[T](list: Seq[T]): Seq[Either[(Int, T), T]] = ???

  def p12[T](list: Seq[(Int, T)]): Seq[T] = ???

  def p13[T](list: Seq[T]): Seq[(Int, T)] = ???

  def p14[T](list: Seq[T]): Seq[T] = ???

  def p15[T](nr: Int, list: Seq[T]): Seq[T] = ???

  def p16[T](nr: Int, list: Seq[T]): Seq[T] = ???

  def p17[T](nr: Int, list: Seq[T]): (Seq[T], Seq[T]) = ???

  def p18[T](from: Int, to: Int, list: Seq[T]): Seq[T] = ???

  def p19[T](nr: Int, list: Seq[T]): Seq[T] = ???

  def p20[T](nr: Int, list: Seq[T]): (Seq[T],T) = ???

  def p21[T](toAdd: T, position: Int, list: Seq[T]): Seq[T] = ???

  def p22(from: Int, to: Int): Seq[Int] = ???

  def p23[T](sel: Int, list: Seq[T]): Seq[T] = ???

  def p24(from: Int, to: Int): Seq[Int] = ???

  def p25[T](list: Seq[T]): Seq[T] = ???

  def p26[T](combined: Int, list: Seq[T]): Seq[Seq[T]] = ???

  def p27[T](list: Seq[T]): Seq[Seq[Seq[T]]] = ???

  def p28[T](list: Seq[Seq[T]]): Seq[Seq[T]] = ???

}