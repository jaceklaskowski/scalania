package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P06.isPalindrome

object P06Spec extends Specification {
  "P06 solution" should {
    "Find out whether a list is a palindrome." in {
      isPalindrome(Seq(1, 1, 2, 3, 5, 8)) mustEqual false
      isPalindrome(Seq(1, 1, 2, 1, 1))
      isPalindrome(Seq(1, 2, 2)) mustEqual false
      isPalindrome(Seq(1, 2, 3, 1, 1)) mustEqual false
    }
  }
}