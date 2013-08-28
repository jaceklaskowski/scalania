package pl.japila.scalania.s99

import org.specs2.mutable
import org.specs2.matcher.{MatchResult, Expectable, Matcher}
import org.scalatest.matchers


class S99TasksTest extends mutable.Specification {

  val solution : S99TasksSolution = new S99TasksSolutionNotImplemented

  case class listMatch[T](list: Seq[T]) extends Matcher[Seq[T]]() {

    override def apply[S <: Seq[T]](t: Expectable[S]): MatchResult[S] = {
       val v = t.value
      val test = list.size == v.size && ( (list zip v) forall { e => e._1 == e._2 } )
      result(test, "list match", "list %s dont match %s".format(v,list) , t)
    }

  }


  "S99TasksSolution implementation" should {
    "Find the last element of a list" in {
      solution.p1(List(1, 1, 2, 3, 5, 8)) == 8
    }
    "Find the last but one element of a list." in {
      solution.p2(List(1, 1, 2, 3, 5, 8)) == 5
    }
    "Find the Kth element of a list." in {
      solution.p3(2, List(1, 1, 2, 3, 5, 8)) == 2
    }
    "Find the number of elements of a list." in {
      solution.p4(List(1, 1, 2, 3, 5, 8)) == 6
    }
    "Reverse a list." in {
      solution.p5(List(1, 1, 2, 3, 5, 8)) must listMatch(List(8, 5, 3, 2, 1, 1))
    }
    "Find out whether a list is a palindrome." in {
      solution.p6( List(1, 1, 2, 3, 5, 8)) must beTrue
    }
    " Flatten a nested list structure." in {
      solution.p7(List(List(1, 1), 2, List(3, List(5, 8)))) must listMatch(List(1, 1, 2, 3, 5, 8))
    }
    "Eliminate consecutive duplicates of list elements." in {
      solution.p8(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must listMatch( List('a, 'b, 'c, 'a, 'd, 'e) )
    }
    " Pack consecutive duplicates of list elements into sublists." in {
      solution.p9(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must listMatch( List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
    }
    "Run-length encoding of a list." in {
      solution.p10(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must listMatch(  List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
    }
    " Modified run-length encoding." in {
      solution.p11(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must listMatch( List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
    }
    "Decode a run-length encoded list." in {
      solution.p12(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) must listMatch( List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)  )
    }
    "Run-length encoding of a list (direct solution)." in {
      solution.p13(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must listMatch( List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)) )
    }
    " Duplicate the elements of a list." in {
      solution.p14(List('a, 'b, 'c, 'c, 'd)) must listMatch( List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd) )
    }
    " Duplicate the elements of a list a given number of times." in {
      solution.p15(3, List('a, 'b, 'c, 'c, 'd)) must listMatch( List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd) )
    }
    " Drop every Nth element from a list." in {
      solution.p16(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must listMatch( List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k) )
    }
    " Split a list into two parts." in {
      val out = solution.p17(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      out._1 must listMatch(List('a, 'b, 'c))
      out._2 must listMatch(List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    }
    " Extract a slice from a list." in {
      solution.p18(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must listMatch(List('d, 'e, 'f, 'g))
    }
    " Rotate a list N places to the left." in {
      solution.p19(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))must listMatch( List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)   )
      solution.p19(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must listMatch( List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i) )
    }
    " Remove the Kth element from a list." in {
      val out = solution.p20(1, List('a, 'b, 'c, 'd))
      out._1 must listMatch( List('a, 'c, 'd) )
      out._2 == 'b
    }
    "Insert an element at a given position into a list." in {
      solution.p21('new, 1, List('a, 'b, 'c, 'd)) must listMatch( List('a, 'new, 'b, 'c, 'd) )
    }
    " Create a list containing all integers within a given range." in {
      solution.p22(4, 9) must listMatch( List(4, 5, 6, 7, 8, 9) )
    }
    "Extract a given number of randomly selected elements from a list." in {
      val input = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
      val output = solution.p23(3,input )
      output.distinct.size == 3
      output.forall( input.contains( _ )) == true
    }
    " Lotto: Draw N different random numbers from the set 1..M." in {
      val randomrange = solution.p24(6, 49)
      randomrange.distinct.size == 6
      randomrange.forall( e => 1 <= e && e <= 49 ) == true
    }
    "Generate a random permutation of the elements of a list." in {
      val input = List('a, 'b, 'c, 'd, 'e, 'f)
      val randomPer = solution.p25(input)
      randomPer.intersect(input) == input
      randomPer.diff(input).size == 0
    }
    "Generate the combinations of K distinct objects chosen from the N elements of a list. WRITE TEST" in {
      val testspec = "In how many ways can a committee of 3 be chosen from a group of 12 people? " +
        "We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficient). " +
        "For pure mathematicians, this result may be great. But we want to really generate all the possibilities. "
      val output = solution.p26(3, List('a, 'b, 'c, 'd, 'e, 'f))
      true == false
      // WRITE TEST
    }
    "Group the elements of a set into disjoint subsets. WRITE TEST" in {
      val input = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
      val output = solution.p27(input)
      true == false
      // write the test code to check the generation or all possibilities
    }
    " Sorting a list of lists according to length of sublists." in {
      solution.p28(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))) must listMatch(  List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l)) )
    }
  }
}