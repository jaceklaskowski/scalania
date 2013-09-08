---
layout: post
title: "Typ wyniku w def(inicji funkcji) w Scali"
---

<a href="http://www.scala-lang.org/"><img border="0" src="{{ site.baseurl }}/images/scala-logo.png" /></a>


Dobrym zwyczajem (przy funkcjach publicznych), a często wymaganiem (przy funkcjach rekurencyjnych) jest jawne zadeklarowanie typu zwracanej wartości funkcji. Typ zwracanej wartości podajemy zaraz za nawiasami okrągłymi z parametrami, po dwukropku, a zaraz przed nawiasem.

	def sum(x: Int, y: Int): Int = x + y

Deklaracja typu wartości zwracanej z funkcji jest opcjonalna i często "wyliczona" przez kompilator.

	def sum(x: Int, y: Int) = x + y

Powyższa definicja `sum` jest równie poprawna jak poprzednia.

Kompilator musi być zawsze w stanie wyznaczyć typ, ale wcale nie musi to być typ oczekiwany. Jeśli jednak jest podany jawnie musi być zgodny z typem wyrażenia, które stanowi ciało funkcji.

Definicja `sum` mogłaby być jednak taka:

	def sum(x: Int, y: Int): Number = x + y

Mogłaby być również `Unit`, czyli określona, ale pusta.

	def sum(x: Int, y: Int): Unit = x + y

Wywołaj wszystkie ze wspomnianych definicji funkcji w Scala REPL. Ostatnia może być szczególnie zaskakująca.

	scala> def sum(x: Int, y: Int): Unit = x + y
	sum: (x: Int, y: Int)Unit

	scala> sum(1,2)

A co z definicją funkcji `def sum(a: String, b: String): T`? Jakie moglibyśmy wyobrazić sobie typy zwracane przez nią? Jakie może być `T` i jaką mogłoby mieć to interpretację?

Czy `T` mogłoby być `String`?

	def sum(a: String, b: String): String = ???

A jaka mogłaby być implementacja funkcji zwracającej `Int`?

	def sum(a: String, b: String): Int = ???

W pierwszym przypadku będzie to łączenie ciągów (konkatenacja), a w drugim suma ich długości. Spróbuj je zaimplementować samodzielnie.
