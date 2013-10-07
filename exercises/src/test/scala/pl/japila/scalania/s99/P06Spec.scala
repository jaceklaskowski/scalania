package pl.japila.scalania.s99

import org.specs2.mutable
import S99_P06.isPalindrome

class P06Spec extends mutable.Specification {
  "P06 solution" should {
    "Find out whether a list is a palindrome." in {
      isPalindrome(List(1, 1, 2, 3, 5, 8)) === false
      isPalindrome(List(1, 1, 2, 1, 1))
    }
  }
}