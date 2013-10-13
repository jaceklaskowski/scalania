---
layout: post
title: "Klasa List w języku Scala - cz. 1"
---

![http://www.scala-lang.org/]({{ site.baseurl }}/images/scala-logo.png)

## Wprowadzenie

Typ [scala.collection.immutable.List](http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.List) (w skrócie `List`) występuje jako dwa byty - klasa i obiekt (towarzyszący).

Przyjrzyjmy się klasie [List](http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.List).

Zacznijmy od [scaladoc dla tej klasy](http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.List), w której napisano:

> "Klasa List reprezentuje niezmienniczą listę jednokierunkową z elementami wybranego typu i pewnym porządku"

Klasa posiada dwie implementacje - obiekt `scala.Nil` oraz klasę `scala.::`, które udostępniają metody `isEmpty`, `head` oraz `tail`.

Klasa `List` jest dopasowana do problemów, w których potrzeba zastosować [_"liniową strukturę danych, w której dane dokładane są na wierzch stosu i z wierzchołka stosu są pobierane"_](http://pl.wikipedia.org/wiki/Stos_\(informatyka\)).

Koszt dodania elementu na początku listy oraz dostępu do elementu początkowego i listy pozostałych jest stały `O(1)`. Natomiast, koszt większości pozostałych operacji - `length`, `append`, `reverse` - wynosi `O(n)` dla `n`-elementowej listy.

Ciekawą lekturą odnośnie efektywności działania operacji różnych strukturach danych, w tym `List` jest dokument [Collections - Performance Characteristics](http://docs.scala-lang.org/overviews/collections/performance-characteristics.html) z oficjalnej dokumentacji języka Scala.

Warto pamiętać, że jakkolwiek `List` współdzieli swoją strukturę, co wpływa na jej wydajność pod kątem szybkości działania oraz oszczędności pamięci, ta efektywność tracona jest w procesie serializacji i deserializacji - każda referencja otrzyma własną kopię listy.

`List`, `Nil` oraz `::` są aliasowane w pakiecie `scala`, co sprawia, że ich użycie nie wymaga importowania (gdyż pakiet `scala` jest importowany przez kompilator).

## Przegląd metod - zestaw podstawowy

Dla przypomnienia: Najefektywniejszymi operacjami na listach jest dostęp do pierwszego elementu (ang. _head_) oraz ogona (ang. _tail_), czyli dodanie lub usunięcie elementu jest najefektywniejsze na początku listy.

#### ++

	scala> List(1,2,3) ++ List(4,5,6)  
	res7: List[Int] = List(1, 2, 3, 4, 5, 6)

#### ::

	scala> 0 :: List(1,2,3)  
	res12: List[Int] = List(0, 1, 2, 3)

Intensywnie używana w dopasowywaniu wzorców (ang. _pattern matching_) i raczej o "historycznym" znaczeniu, gdyż istniała w innych językach. Korzystać z umiarem na rzecz ```+:```.

#### +:

	scala> 0 +: List(1,2,3)  
	res29: List[Int] = List(0, 1, 2, 3)

#### apply(n: Int): A

	scala> List(1,2,3)(0)  
	res13: Int = 1

#### contains(elem: Any): Boolean

	scala> List(1,2,3).contains(2)  
	res19: Boolean = true

#### count(p: (A) ⇒ Boolean): Int

	scala> List(1,2,3).count( _ > 0)  
	res21: Int = 3

#### drop(n: Int): List\[A\]

	scala> List(1,2,3).drop(2)  
	res22: List[Int] = List(3)

#### dropWhile(p: (A) ⇒ Boolean): List\[A\]

	scala> List(1,2,3).dropWhile(_ < 2)  
	res23: List[Int] = List(2, 3)

#### exists(p: (A) ⇒ Boolean): Boolean

	scala> List(1,2,3).exists(_ == 2)  
	res24: Boolean = true

#### filter(p: (A) ⇒ Boolean): List\[A\]

	scala> List(1,2,3).filter(_ % 2 == 1)  
	res26: List[Int] = List(1, 3)

#### filterNot(p: (A) ⇒ Boolean): List\[A\]

	scala> List(1,2,3).filterNot(_ % 2 == 	1)  
	res27: List[Int] = List(2)

#### find(p: (A) ⇒ Boolean): Option\[A\]

	scala> List(1,2,3).find(_ > 1)
	res28: Option[Int] = Some(2)
	
	scala> List(1,2,3).find(_ == 3)
	res29: Option[Int] = Some(3)
	
	scala> List(1,2,3).find(_ > 4)
	res30: Option[Int] = None	

#### flatMap\[B\](f: (A) ⇒ GenTraversableOnce\[B\]): List\[B\]

	scala> def f(x: Int) = List(x, x*x)
	f: (x: Int)List[Int]
	
	scala> List(1,2,3).flatMap(x => f(x))
	res31: List[Int] = List(1, 1, 2, 4, 3, 9)
	
#### fold\[A1 >: A\](z: A1)(op: (A1, A1) ⇒ A1): A1

	scala> List(1,5,10).fold(0)(_ + _)
	res32: Int = 16

#### foldLeft\[B\](z: B)(f: (B, A) ⇒ B): B

	scala> List(1,5,10).foldLeft(0)(_ + _)
	res33: Int = 16

#### foldRight\[B\](z: B)(op: (A, B) ⇒ B): B

	scala> List(1,5,10).foldRight(0)(_ + _)
	res34: Int = 16

#### forall(p: (A) ⇒ Boolean): Boolean

	scala> List(1,2,3,4,5).forall(_ > 0)
	res35: Boolean = true
	
	scala> List(1,2,3,4,5).forall(_ <= 5)
	res36: Boolean = true
	
	scala> List(1,2,3,4,5).forall(_ == 3)
	res37: Boolean = false

#### foreach(f: (A) ⇒ Unit): Unit

	scala> List(1,2,3,4,5).foreach(println)
	1
	2
	3
	4
	5

#### groupBy\[K\](f: (A) ⇒ K): Map\[K, List\[A\]\]

	scala> List("Scala", "Java", "Groovy", "Python", "PHP", "Pascal", "C++", "C#", "C").groupBy(_.charAt(0))
	res38: scala.collection.immutable.Map[Char,List[java.lang.String]] = Map(J -> List(Java), G -> List(Groovy), P -> List(Python, PHP, Pascal), C -> List(C++, C#, C), S -> List(Scala))

#### grouped(size: Int): Iterator\[List\[A\]\]

	scala> List(1,2,3,4,5,6).grouped(2).toList
	res39: List[List[Int]] = List(List(1, 2), List(3, 4), List(5, 6))

#### head: A

	scala> List(2,4,8,16).head
	res40: Int = 2

#### indexOf(elem: A): Int

	scala> List("Scala", "Java", "Groovy", "Python").indexOf("Java")
	res41: Int = 1
	
#### indexWhere(p: (A) ⇒ Boolean): Int

	scala> List(1,2,3,4,5,6).indexWhere(_ % 3 == 0)
	res42: Int = 2
	
#### init: List\[A\]

	scala> List(1,2,3,4,5,6).init
	res43: List[Int] = List(1, 2, 3, 4, 5)

#### isEmpty: Boolean

	scala> List().isEmpty
	res44: Boolean = true
	
	scala> List(1).isEmpty
	res45: Boolean = false

#### iterator: Iterator\[A\]

	scala> List().iterator
	res46: Iterator[Nothing] = empty iterator
	
	scala> List(1,2,3,4).iterator
	res47: Iterator[Int] = non-empty iterator

#### length: Int

	scala> List(1,2,3).length
	res48: Int = 3

#### map\[B\](f: (A) ⇒ B): List\[B\]

	scala> def f(x: Int) = x*x
	f: (x: Int)Int

	scala> List(1,2,3).map(f(_))
	res49: List[Int] = List(1, 4, 9)
	
	scala> List(1,2,3).map(x => f(x))
	res50: List[Int] = List(1, 4, 9)


#### max: A

	scala> List(1,4,6,2,3,0).max
	res51: Int = 6

#### maxBy\[B\](f: (A) ⇒ B)(implicit cmp: Ordering\[B\]): A

	scala> List("Scala", "Java", "Groovy").maxBy(_.length)
	res52: java.lang.String = Groovy
	
#### min: A

	scala> List(5,3,6,7,2,4).min
	res53: Int = 2

#### minBy\[B\](f: (A) ⇒ B)(implicit cmp: Ordering\[B\]): A

	scala> List("Scala", "Java", "Groovy").minBy(_.length)
	res54: java.lang.String = Java
	
#### mkString: String

	scala> List(1,2,3,4).mkString
	res55: String = 1234

#### mkString(sep: String): String

	scala> List(1,2,3,4).mkString(",")
	res56: String = 1,2,3,4

#### mkString(start: String, sep: String, end: String): String

	scala> List(1,2,3,4).mkString("{", ",", "}")
	res57: String = {1,2,3,4}

#### par: ParSeq\[A\]

	scala> List(1,2,3,4,5,6).par
	res58: scala.collection.parallel.immutable.ParSeq[Int] = ParVector(1, 2, 3, 4, 5, 6)

#### partition(p: (A) ⇒ Boolean): (List\[A\], List\[A\])

	scala> List(1,2,3,4,5,6,7).partition(_ % 2 == 0)
	res59: (List[Int], List[Int]) = (List(2, 4, 6),List(1, 3, 5, 7))

#### permutations: Iterator\[List\[A\]\]

	scala> List(1,2,3).permutations.toList
	res60: List[List[Int]] = List(List(1, 2, 3), List(1, 3, 2), List(2, 1, 3), List(2, 3, 1), List(3, 1, 2), List(3, 2, 1))

#### prefixLength(p: (A) ⇒ Boolean): Int

	scala> List(1,3,2,5).prefixLength(_ < 5)
	res61: Int = 3

#### reduce\[A1 >: A\](op: (A1, A1) ⇒ A1): A1

	scala> List(1,2,3,4,5).reduce(_ * _)
	res62: Int = 120

#### reduceLeft\[B >: A\](f: (B, A) ⇒ B): B

	scala> List(1,2,3,4,5).reduceLeft(_ * _)
	res63: Int = 120

#### reduceRight\[B >: A\](op: (A, B) ⇒ B): B

	scala> List(1,2,3,4,5).reduceRight(_ * _)
	res64: Int = 120

#### reverse: List\[A\]

	scala> List(1,2,3,4,5).reverse
	res65: List[Int] = List(5, 4, 3, 2, 1)

#### sortBy\[B\](f: (A) ⇒ B)(implicit ord: math.Ordering\[B\]): List\[A\]

	scala> List("Scala", "Java", "Groovy", "Python", "Ruby", "C").sortBy(_.charAt(0))
	res66: List[java.lang.String] = List(C, Groovy, Java, Python, Ruby, Scala)

#### span(p: (A) ⇒ Boolean): (List\[A\], List\[A\])

	scala> List(1,2,3,4,5,6).span(_ < 4)
	res67: (List[Int], List[Int]) = (List(1, 2, 3),List(4, 5, 6))

#### tail: List\[A\]

	scala> List(1,2,3,4,5,6).tail
	res68: List[Int] = List(2, 3, 4, 5, 6)

#### take(n: Int): List\[A\]

	scala> List("a", "b", "c", "d", "e", "f", "g").take(3)
	res69: List[java.lang.String] = List(a, b, c)

#### takeWhile(p: (A) ⇒ Boolean): List\[A\]

	scala> List("c", "b", "a", "d", "f", "e").takeWhile(_ != "f")
	res70: List[java.lang.String] = List(c, b, a, d)

#### toSeq: Seq\[A\]

	scala> List("c", "b", "a", "d", "f", "e").toSeq
	res71: scala.collection.immutable.Seq[java.lang.String] = List(c, b, a, d, f, e)
	
#### view: SeqView\[A, List\[A\]\]
	
	// lazy
	scala> def view = List(1,2,3).view.map{x => println(x+"*"+x+"="+x*x); x*x}
	view: scala.collection.SeqView[Int,Seq[_]]
	
	scala> view(2)
	3*3=9
	res72: Int = 9
	
	scala> view(1)
	2*2=4
	res73: Int = 4
	
	// eager
	scala> List(1,2,3).map{x => println(x+"*"+x+"="+x*x); x*x}
	1*1=1
	2*2=4
	3*3=9
	res74: List[Int] = List(1, 4, 9)

#### withFilter(p: (A) ⇒ Boolean): FilterMonadic\[A, List\[A\]\]

	scala> List(1,2,3,4).withFilter(_ % 2 == 0).map(x => x * x)
	res75: List[Int] = List(4, 16)
	
#### zip\[B\](that: GenIterable\[B\]): List\[(A, B)\]

	scala> List("a","b","c").zip(List(1,2,3))
	res76: List[(java.lang.String, Int)] = List((a,1), (b,2), (c,3))
	
#### zipWithIndex: List\[(A, Int)\]

	scala> List("a","b","c").zipWithIndex
	res77: List[(java.lang.String, Int)] = List((a,0), (b,1), (c,2))