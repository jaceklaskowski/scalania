package pl.japila.scalania.s99

import org.specs2.mutable._

class P28Spec extends Specification with ExamplesBlock {
  "P28a solution" should {
    import S99_P28.solutions
    "Sort a list of lists according to length of sublists." in {
      solutions[Symbol].foreach {
        case (solution, lsortImpl) =>
          solution >> {
            val actual = lsortImpl(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
            val expected = List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))
            actual === expected
          }
      }
    }
    "Handle empty lists without exceptions." in {
      solutions[Symbol].foreach {
        case (solution, lsortImpl) =>
          solution >> {
            lsortImpl(List()) === List()
            lsortImpl(List(List('a, 'b), List(), List())) === List(List(), List(), List('a, 'b))
          }
      }
    }
  }
  "P28b solution" should {
    import S99_P28.solutionsFreq
    "Sort lists according to their length frequency" in {
      solutionsFreq[Symbol].foreach {
        case (solution, lsortFreqImpl) =>
          solution >> {
            val actual = lsortFreqImpl(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
            val expected = List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))
            actual === expected
          }
      }
    }
    "Handle empty lists without exceptions." in {
      solutionsFreq[Symbol].foreach {
        case (solution, lsortImpl) =>
          solution >> {
            lsortImpl(List()) === List()
            lsortImpl(List(List('a, 'b), List(), List())) === List(List('a, 'b), List(), List())
          }
      }
    }
  }
}
