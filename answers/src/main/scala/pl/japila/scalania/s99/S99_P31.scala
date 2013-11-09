package pl.japila.scalania.s99

object S99_P31 {
  implicit class IntWithIsPrime(n: Int) {
    def isPrime: Boolean =
      (n > 1) && (primes takeWhile { _ <= Math.sqrt(n) } forall { n % _ != 0 })

    val primes = Stream.cons(2, Stream.from(3, 2) filter { _.isPrime })
  }
}
