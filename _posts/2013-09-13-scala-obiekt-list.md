---
layout: post
title: "Obiekt scala.List w języku Scala"
---

<a href="http://www.scala-lang.org/"><img border="0" src="{{ site.baseurl }}/images/scala-logo.png" /></a>

Typ [scala.collection.immutable.List](http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.List) (w skrócie `List`) występuje jako dwa byty - klasa i obiekt (towarzyszący).

Przyjrzyjmy się najpierw obiektowi [List](http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.List$).

Za pomocą metody `apply[A](xs: A*): List[A]`, która jest konstruktorem typu `List`, tworzymy instancję `List[A]`.

	scala> List(1,2,3)
	res0: List[Int] = List(1, 2, 3)

	scala> List("Jeden", "Dwa", "Trzy")
	res1: List[String] = List(Jeden, Dwa, Trzy)

Oczywiście wszystkie elementy muszą być tego samego typy, albo kompilator sprowadzi typ do wspólnego w hierarchi typów.

	scala> List('a, "Dwa", 3)
	res2: List[Any] = List('a, Dwa, 3)

Stąd też w powyższym przypadku otrzymaliśmy `List[Any]`, w którym `Any` jest najbardziej wspólnym typem dla podanych elementów.

Natomiast w poniższym przykładzie, kopilator Scali wydedukował, że typem wspólnym wszystkich elementów listy będzie `Double`.

	scala> List(1.0, 0x2, 3)
	res3: List[Double] = List(1.0, 2.0, 3.0)

W szczególności, podanie pustej listy argumentów utworzy listę pustą.

	scala> List()
	res4: List[Nothing] = List()

Kolejną metodą jest `concat[A](xss: collection.Traversable[A]*): List[A]`, której zadaniem jest połączenie podanych kolekcji w jedną listę.

	scala> List.concat(res1, res2)
	res5: List[Any] = List(Jeden, Dwa, Trzy, 'a, Dwa, 3)

	scala> List.concat(List(List('a)), List(1,2,3))
	res6: List[Any] = List(List('a), 1, 2, 3)

Do utworzenia pustej listy służy metoda `List.empty()` lub po prostu skorzystanie z jedynej instancji obiektu [scala.collection.immutable.Nil](http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.Nil$), tj. `Nil`.

	scala> List.empty
	res7: List[Nothing] = List()

	scala> Nil
	res8: scala.collection.immutable.Nil.type = List()

	scala> List.empty == Nil
	res9: Boolean = true

Metoda `fill[A](n: Int)(elem: ⇒ A): List[A]` (posiadająca wersje aż do 5 parametrów wejściowych) tworzy listę `n`-elementową, w której wyliczamy `elem`.

	scala> List.fill(1,2) { math.random }
	res10: List[List[Double]] = List(List(0.08076240988748573, 0.9430306437448902))

Metoda `iterate[A](start: A, len: Int)(f: (A) ⇒ A): List[A]` tworzy listę długości `len` z wynikami wykonania funkcji `f` na poprzednim wyniku, począwszy od `start`, tj. `List(start, f(start), f(f(start)))`.

	scala> List.iterate(0, 5) { x => x + 2 }
	res11: List[Int] = List(0, 2, 4, 6, 8)

Metoda `range[T](start: T, end: T, step: T)(implicit arg0: Integral[T]): List[T]` tworzy listę z elementami od `start` do `end` o przyroście `step`.

	scala> List.range(0, 5, 1)
	res12: List[Int] = List(0, 1, 2, 3, 4)

	scala> List.range(0, 10, 2)
	res13: List[Int] = List(0, 2, 4, 6, 8)

Ostatnią omówioną metodą jest `tabulate[A](n: Int)(f: (Int) ⇒ A): List[A]`, która tworzy listę zawierającą elementy, będące wynikiem funkcji `f` na kolejnych liczbach całkowitych, począwszy od 0.

	scala> List.tabulate(0) { x => x }
	res14: List[Int] = List()

	scala> List.tabulate(5) { x => x }
	res15: List[Int] = List(0, 1, 2, 3, 4)

	scala> List.tabulate(5) { x => x + x }
	res16: List[Int] = List(0, 2, 4, 6, 8)

Typ `List` jest dostępny domyślnie bez konieczności importowania pakietu `scala.collection.immutable`. Wszystko za sprawą obiektu [scala.Predef](http://www.scala-lang.org/api/current/index.html#scala.Predef$), który jest importowany domyślnie i który aliasuje (« ? TODO) typ `scala.collection.immutable.List`.