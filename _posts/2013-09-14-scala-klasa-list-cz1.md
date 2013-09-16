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

	scala> List(1,2,3).filterNot(_ % 2 == 1)
	res27: List[Int] = List(2)

#### find(p: (A) ⇒ Boolean): Option\[A\]
#### flatMap\[B\](f: (A) ⇒ GenTraversableOnce\[B\]): List\[B\]
#### fold\[A1 >: A\](z: A1)(op: (A1, A1) ⇒ A1): A1
#### foldLeft\[B\](z: B)(f: (B, A) ⇒ B): B
#### foldRight\[B\](z: B)(op: (A, B) ⇒ B): B
#### forall(p: (A) ⇒ Boolean): Boolean
#### foreach(f: (A) ⇒ Unit): Unit
#### groupBy\[K\](f: (A) ⇒ K): Map\[K, List\[A\]\]
#### grouped(size: Int): Iterator\[List\[A\]\]
#### head: A
#### indexOf(elem: A): Int
#### indexWhere(p: (A) ⇒ Boolean): Int
#### init: List\[A\]
#### isEmpty: Boolean
#### iterator: Iterator\[A\]
#### length: Int
#### map\[B\](f: (A) ⇒ B): List\[B\]
#### max: A
#### maxBy\[B\](f: (A) ⇒ B)(implicit cmp: Ordering\[B\]): A
#### min: A
#### minBy\[B\](f: (A) ⇒ B)(implicit cmp: Ordering\[B\]): A
#### mkString: String
#### mkString(sep: String): String
#### mkString(start: String, sep: String, end: String): String
#### par: ParSeq\[A\]
#### partition(p: (A) ⇒ Boolean): (List\[A\], List\[A\])
#### permutations: Iterator\[List\[A\]\]
#### prefixLength(p: (A) ⇒ Boolean): Int
#### reduce\[A1 >: A\](op: (A1, A1) ⇒ A1): A1
#### reduceLeft\[B >: A\](f: (B, A) ⇒ B): B
#### reduceRight\[B >: A\](op: (A, B) ⇒ B): B
#### reverse: List\[A\]
#### sortBy\[B\](f: (A) ⇒ B)(implicit ord: math.Ordering\[B\]): List\[A\]
#### span(p: (A) ⇒ Boolean): (List\[A\], List\[A\])
#### tail: List\[A\]
#### take(n: Int): List\[A\]
#### takeWhile(p: (A) ⇒ Boolean): List\[A\]
#### toSeq: Seq\[A\]
#### view: SeqView\[A, List\[A\]\]
#### withFilter(p: (A) ⇒ Boolean): FilterMonadic\[A, List\[A\]\]
#### zip\[B\](that: GenIterable\[B\]): List\[(A, B)\]
#### zipWithIndex: List\[(A, Int)\]