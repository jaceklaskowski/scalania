---
layout: post
title: "O typach w def(inicjach funkcji) w języku Scala cz. 2"
---

<a href="http://www.scala-lang.org/"><img border="0" src="{{ site.baseurl }}/images/scala-logo.png" /></a>

Definicja funkcji może posiadać parametry typów w nawiasach kwadratowych `[]`, oddzielonych przecinkiem. Deklaracja typów parametrów występuje po nazwie funkcji, a przed listą jej parametrów, np.

	def flatMap[B](f: (A) ⇒ GenTraversableOnce[B]): List[B]

W powyższym przykładzie metoda `flatMap` klasy 
[scala.collection.immutable.List](http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.List) jest parametryzowana przez typ `B`.

Weźmy inna metodę

	def iterate[A](start: A, len: Int)(f: (A) ⇒ A): List[A]

tym razem z obiektu [scala.collection.immutable.List](http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.List$).

Czy patrząc na jej deklarację jesteś w stanie zrozumieć jej znaczenie? Czy do jej zrozumienia musisz znać typ `A`?

	scala> import scala.collection.immutable.List._
	import scala.collection.immutable.List._

	scala> iterate(0, 5)(n => n + 1)
	res0: List[Int] = List(0, 1, 2, 3, 4)

	scala> iterate('a', 5)(c => (c.toInt + 1).toChar)
	res1: List[Char] = List(a, b, c, d, e)

	scala> iterate("a", 5)(s => s + s)
	res2: List[String] = List(a, aa, aaaa, aaaaaaaa, aaaaaaaaaaaaaaaa)

Jak mogłaś zauważyć, kompilator Scali wydedukował typ dla `A` i w pierwszym przypadku był to `Int`, później `Char`, aby skończyć na `String`. Wciąż definicja funkcji `iterate` pozostała taka sama, a faktyczny typ miał mniejsze znaczenie (co nie oznacza, że nie miał znaczenia w ogóle).

Jest wiele funkcji, które nie tracą na swoim znaczeniu, kiedy typ parametrów jest podany (jawnie lub niejawnie) później i `List.iterate` jest tego dobrym przykładem.
